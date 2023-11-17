package hn.lenguajes0.banco.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.lenguajes0.banco.modelos.Cliente;
import hn.lenguajes0.banco.modelos.Cuenta;
import hn.lenguajes0.banco.repositorios.ClienteRepository;
import hn.lenguajes0.banco.repositorios.CuentaRepository;
import hn.lenguajes0.banco.servicios.CuentaService;

@Service
public class CuentaServiceImpl implements CuentaService{

    @Autowired
    private CuentaRepository cuentaRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente agregarCuentaCliente(String dni, Cuenta cuenta) {
        Cliente cteActualizar = this.buscarCliente(dni);

        if(cteActualizar != null){
            cuenta.setCliente(cteActualizar);
            this.cuentaRepository.save(cuenta);
        }

        return cteActualizar;
        
    }

    private Cliente buscarCliente(String dni){
        return this.clienteRepository.findById(dni).get();
    }
    
}
