package com.example.semana7.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "filial")
@Data
public class FilialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String localizacao;
    private Integer anosServico;

//    @OneToMany
//    List<GerenteEntity> gerenteEntities;

}
