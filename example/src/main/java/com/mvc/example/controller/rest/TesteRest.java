package com.mvc.example.controller.rest;

import com.mvc.example.modal.entity.Teste;
import com.mvc.example.modal.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teste")
public class TesteRest {

    @Autowired
    private TesteService testeService;

    @GetMapping
    public List<Teste> findAll(){
        return testeService.findAll();
    }

    @GetMapping("/{id}")
    public Teste findById(@PathVariable Long id){
        return testeService.findById(id);
    }

    @PostMapping
    public Teste salvar(@RequestBody Teste teste){
        return testeService.salvar(teste);
    }

    @PutMapping("/{id}")
    public Teste editar(@PathVariable Long id, @RequestBody Teste teste){
        return testeService.editar(id, teste);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){

        testeService.delete(id);
    }
}
