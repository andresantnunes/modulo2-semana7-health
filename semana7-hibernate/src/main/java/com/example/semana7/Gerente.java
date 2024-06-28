package com.example.semana7;

import jakarta.persistence.*;
import lombok.Data;

@Data // getter, setter e noArgsConstrutor, é feito para entidades
@Entity // Identifica a Classe como um Entidade
@Table(name = "Gerente")// Indentica a Classe como tabela e permite ajustes de nome e outros atributos da tabela
public class Gerente {
    @Id // Identifica o campo como chave primária
    // Gera um campo que vai ter uma estratégia de geração de valores, varia conforme o banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //identifica uma coluna, é opcional, porém nos permite mudar o nome de uma coluna e definir atributos dela
    @Column(length = 300, nullable = false)
    private String nome;

    private String filial;
    private Double salario;
    private Integer idade;



}
