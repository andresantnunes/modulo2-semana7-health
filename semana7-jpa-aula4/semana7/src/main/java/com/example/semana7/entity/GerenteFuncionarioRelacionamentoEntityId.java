package com.example.semana7.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class GerenteFuncionarioRelacionamentoEntityId implements Serializable {

    @ManyToOne
    private FuncionarioEntity funcionarioId;

    @ManyToOne
    private GerenteEntity gerenteId;

}
