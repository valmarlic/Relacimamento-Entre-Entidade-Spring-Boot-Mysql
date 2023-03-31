package com.exemplo01onetoone.Exemplo01onetoone.controle;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo01onetoone.Exemplo01onetoone.modelo.Cargo;
import com.exemplo01onetoone.Exemplo01onetoone.modelo.Colaborador;
import com.exemplo01onetoone.Exemplo01onetoone.repositorio.CargoRepositorio;

@RestController
@RequestMapping("/cargos")
public class CargoControle {
    @Autowired
    private CargoRepositorio cargoRepositorio;
    @GetMapping
    public Iterable<Cargo> listar(){
        return cargoRepositorio.findAll();
    }
    @PostMapping
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargoRepositorio.save(obj);
    }
    
}
