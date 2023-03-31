package com.exemplo03manytomany.Exemplo03manytomany.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo03manytomany.Exemplo03manytomany.modelo.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long>{
}
