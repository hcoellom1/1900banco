package hn.lenguajes0.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.banco.modelos.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>{
    
}
