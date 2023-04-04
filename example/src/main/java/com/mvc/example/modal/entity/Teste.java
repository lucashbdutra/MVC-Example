package com.mvc.example.modal.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Teste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    private String contato;
    private String cpf;

}
