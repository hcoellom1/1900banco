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
    public String eliminarClientePorId(String numeroCliente) {
        Cliente cteEliminar = this.clienteRepository.findById(numeroCliente).get();

        if(cteEliminar != null){
            this.clienteRepository.delete(cteEliminar);
            return "Se ha eliminado el cliente: " + cteEliminar.getDni(); 
        }

        return "No existe el cliente con dni: " + numeroCliente;
    }

    

    @Override
    public List<Cliente> obtenerTodosCliente() {
        return this.clienteRepository.findAll();        
    }

    @Override
    public String actualizarCliente(String dni, Cliente cliente) {
        Cliente cteActualizar = this.clienteRepository.findById(dni).get();

        if(cteActualizar != null){
            cteActualizar.setCorreo(cliente.getCorreo());
            cteActualizar.setTelefono(cliente.getTelefono());
            this.clienteRepository.save(cteActualizar);
            return "Se ha actualizado el cliente: " + dni;
        }

        return "No existe el cliente con DNI: " + dni;     
    }


    
}
