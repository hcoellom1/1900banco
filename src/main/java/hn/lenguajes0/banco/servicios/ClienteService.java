package hn.lenguajes0.banco.servicios;

import java.util.List;

import hn.lenguajes0.banco.modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente nvoCliente);

    public String eliminarClientePorId(String numeroCliente);

    public List<Cliente> obtenerTodosCliente();

    public String actualizarCliente(String dni, Cliente cliente);
    
    
}
