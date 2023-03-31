package com.exemplo01onetoone.Exemplo01onetoone.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo01onetoone.Exemplo01onetoone.modelo.Colaborador;
import com.exemplo01onetoone.Exemplo01onetoone.repositorio.ColaboradorRepositorio;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {
    @Autowired
    private ColaboradorRepositorio colaboradorRepositorio;
    @GetMapping
    public Iterable<Colaborador> listar(){
        return colaboradorRepositorio.findAll();
    }
@PostMapping
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return colaboradorRepositorio.save(obj);
    }

    
}
