package com.exemplo02onetomany.Exemplo02onetmany.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemplo02onetomany.Exemplo02onetmany.modelo.Comentario;

@Repository
public interface ComentarioRepositorio extends JpaRepository<Comentario,Long> {
    
}
