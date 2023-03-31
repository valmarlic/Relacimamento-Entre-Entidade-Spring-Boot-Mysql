package com.exemplo01onetoone.Exemplo01onetoone.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo01onetoone.Exemplo01onetoone.modelo.Cargo;

@Repository
public interface CargoRepositorio extends JpaRepository<Cargo, Long>{
    
}
