package hn.lenguajes0.banco.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {


    @Column(name="dni")
    private String dni;
    
}
