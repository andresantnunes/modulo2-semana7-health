package com.example.semana7.repository;

import com.example.semana7.entity.FilialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilialRepository extends JpaRepository<FilialEntity, Long> {

    // iqual a um select por nome
    // encontre todos os itens em FilialEntity que tenham o nome X
    List<FilialEntity> findAllByNome(String nome);

    // iqual a um select por nome e anoServico
    // encontre todos os itens em FilialEntity que tenham o nome X e o anosSevico Y
    List<FilialEntity> findAllByNomeAndAnosServico(String nome, Integer anosServico);

    // iqual a um select por nome ou anoServico
    List<FilialEntity> findAllByNomeOrAnosServico(String nome, Integer anosServico);

    // iqual a um select por nome ou anoServico ou id
    List<FilialEntity> findAllByNomeOrAnosServicoOrId(String nome, Integer anosServico, Long id);
}
