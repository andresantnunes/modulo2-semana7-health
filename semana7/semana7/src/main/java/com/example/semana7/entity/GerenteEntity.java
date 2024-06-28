package com.example.semana7.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gerente")
public class GerenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Equivale a um bigint no postgres
    @Column(name = "nome_gerente",length = 300, nullable = false) // adiciona metadados as colunas
    private String nome;

    @ManyToOne // indica que temos um FK do tipo N:1
    @JoinColumn(name = "id_filial") // id_filial -> ids da filial, a nível de tabela
    private FilialEntity filial;
    private Double salario; // é uma coluna
    private Integer idade;
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
