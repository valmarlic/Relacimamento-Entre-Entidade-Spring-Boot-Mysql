package com.exemplo02onetomany.Exemplo02onetmany.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo02onetomany.Exemplo02onetmany.modelo.Comentario;
import com.exemplo02onetomany.Exemplo02onetmany.modelo.Postagem;
import com.exemplo02onetomany.Exemplo02onetmany.repositorio.PostagemRepositorio;

@RestController
@RequestMapping(value = "/postagens")
public class PostagemControle {
    @Autowired
    private PostagemRepositorio postagemRepositorio;
    @GetMapping
    public Iterable<Postagem> listar(){
        return postagemRepositorio.findAll();
    }
    @PostMapping
    public Postagem cadastrar(@RequestBody Postagem obj){
        return postagemRepositorio.save(obj);
    }
}
