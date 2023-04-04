package com.mvc.example.modal.service;

import com.mvc.example.modal.entity.Teste;
import com.mvc.example.modal.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TesteService {

    @Autowired
    private TesteRepository testeRepository;

    public Teste findById(Long id){
        Teste teste = testeRepository.findById(id).orElse(null);
        return teste;
    }

    public List<Teste> findAll(){
        return testeRepository.findAll();
    }

    public void delete(Long id){
        testeRepository.deleteById(id);
    }

    public Teste editar(Long id, Teste novoTeste){
        Teste teste = testeRepository.findById(id).orElse(null);
        teste.setContato(novoTeste.getContato());
        teste.setCpf(novoTeste.getCpf());
        teste.setNome(novoTeste.getNome());

        testeRepository.save(teste);

        return teste;
    }

    public Teste salvar(Teste teste){
        testeRepository.save(teste);
        return teste;
    }
}
