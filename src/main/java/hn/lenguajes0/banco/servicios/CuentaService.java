package hn.lenguajes0.banco.servicios;

import hn.lenguajes0.banco.modelos.Cuenta;
import hn.lenguajes0.banco.modelos.Cliente;

public interface CuentaService {
    
    public Cliente agregarCuentaCliente(String dni, Cuenta cuenta);

}
