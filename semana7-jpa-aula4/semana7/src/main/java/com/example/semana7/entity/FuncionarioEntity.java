package com.example.semana7.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "filial")
@Data
public class FuncionarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double salario;

//    @ManyToMany
//    @JoinTable (
//            name = "funcionario_gerente", //nome da tabela de junção/relacionamento
//
//            //define as colunas da tabela de junção
//            joinColumns = @JoinColumn(name = "funcionario_id"), //id dessa classe na Tabela de Relacionamento
//            inverseJoinColumns = @JoinColumn(name = "gerente_id") //define o nome para o id da Classe que está do outro lado do relacionamento
//    )
//    private List<GerenteEntity> gerentes;
}
