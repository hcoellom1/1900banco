package hn.lenguajes0.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.banco.modelos.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{
    
}
