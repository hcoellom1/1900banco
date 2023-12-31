package hn.lenguajes0.banco.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.lenguajes0.banco.modelos.Cliente;
import hn.lenguajes0.banco.modelos.Cuenta;
import hn.lenguajes0.banco.modelos.Movimiento;
import hn.lenguajes0.banco.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
 
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente nvoCliente){     
        if(nvoCliente.getDireccion() != null)   {
            nvoCliente.getDireccion().setCliente(nvoCliente);
        }

        if(nvoCliente.getCuentas() != null){
            for (Cuenta cuenta : nvoCliente.getCuentas()) {
                cuenta.setCliente(nvoCliente);                
            }
        }

        return this.clienteServiceImpl.crearCliente(nvoCliente);
    }    

    @GetMapping("/obtener/todos")
    public List<Cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodosCliente();
    }

    @DeleteMapping("/eliminar")
    public String eliminarClientePorDNI(@RequestParam(name="dni") String dni){
        return this.clienteServiceImpl.eliminarClientePorId(dni);
    }

    @PutMapping("/actualizar")
    public String actualizarPorId(@RequestParam(name="dni") String dni,
                                  @RequestBody Cliente cliente){
        return this.clienteServiceImpl.actualizarCliente(dni, cliente);
    }
        

}
