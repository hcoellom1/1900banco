package hn.lenguajes0.banco.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.lenguajes0.banco.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
    
}
