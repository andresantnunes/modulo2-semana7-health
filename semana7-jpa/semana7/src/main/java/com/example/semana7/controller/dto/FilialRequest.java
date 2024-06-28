package com.example.semana7.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FilialRequest {
    private String nome;
    private String localizacao;
    private Integer anosServico;
}
