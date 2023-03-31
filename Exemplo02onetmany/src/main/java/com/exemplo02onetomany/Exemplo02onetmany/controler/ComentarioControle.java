package com.exemplo02onetomany.Exemplo02onetmany.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo02onetomany.Exemplo02onetmany.modelo.Comentario;
import com.exemplo02onetomany.Exemplo02onetmany.repositorio.ComentarioRepositorio;

@RestController
@RequestMapping(value = "/comentarios")
public class ComentarioControle {
    @Autowired
    private ComentarioRepositorio comentarioRepositorio;
@GetMapping
public Iterable<Comentario>Listar(){
    return comentarioRepositorio.findAll();
}
@PostMapping
public Comentario cadastrar(@RequestBody Comentario obj){
 return comentarioRepositorio.save(obj);
}
    
}
