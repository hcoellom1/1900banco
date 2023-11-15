package hn.lenguajes0.banco.servicios.impl;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.banco.modelos.Cliente;
import hn.lenguajes0.banco.repositorios.ClienteRepository;
import hn.lenguajes0.banco.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente nvoCliente) {
        //Direcciones direccion = nvoCliente.getDireccion();
        //direccion.setCliente(nvoCliente);
        //nvoCliente.setDireccion(direccion);
        return clienteRepository.save(nvoCliente);        

    }

    @Override
    public Cliente eliminarClientePorId(String numeroCliente) {
        Cliente clienteBuscado = null;        
        if(this.clienteRepository.existsById(numeroCliente)){
            this.clienteRepository.deleteById(numeroCliente);
        }
        
        return clienteBuscado;
    }

    

    @Override
    public List<Cliente> obtenerTodosCliente() {
        return this.clienteRepository.findAll();        
    }


    
}
