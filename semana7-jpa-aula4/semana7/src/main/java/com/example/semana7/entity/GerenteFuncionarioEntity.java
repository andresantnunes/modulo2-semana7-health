package com.example.semana7.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gerente_funcionario")
public class GerenteFuncionarioEntity {

//    Forma antida de fazer PK composta
//    @EmbeddedId
//    private GerenteFuncionarioRelacionamentoEntityId id;
    
//    Forma atual de fazer PK Composta
    @Id
    @ManyToOne
    private FuncionarioEntity funcionarioId;

    @Id
    @ManyToOne
    private GerenteEntity gerenteId;

}
