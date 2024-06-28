package com.example.semana7.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FilialResponse {

    private Long id;
    private String nome;
    private Integer anosServico;
}
