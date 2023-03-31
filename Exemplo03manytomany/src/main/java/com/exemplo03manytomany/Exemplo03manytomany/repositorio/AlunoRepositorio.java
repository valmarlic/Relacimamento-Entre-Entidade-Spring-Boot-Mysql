package com.exemplo03manytomany.Exemplo03manytomany.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo03manytomany.Exemplo03manytomany.modelo.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{
    
}
