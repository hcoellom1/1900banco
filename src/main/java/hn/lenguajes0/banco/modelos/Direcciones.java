package hn.lenguajes0.banco.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="direcciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Direcciones {

    @Id
    @Column(name="iddireccion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int idDireccion;

    private String departamento;

    private String ciudad;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

    
    
}
