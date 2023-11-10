package hn.lenguajes0.banco.servicios.impl;

import java.util.List;

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
        Cliente clienteCreado = clienteRepository.save(nvoCliente);
        return clienteCreado;

    }

    @Override
    public Cliente eliminarClientePorId(String numeroCliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarClientePorId'");
    }

    @Override
    public List<Cliente> obtenerTodosCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerTodosCliente'");
    }
    
}
