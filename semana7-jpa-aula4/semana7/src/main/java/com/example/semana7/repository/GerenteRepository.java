package com.example.semana7.repository;

import com.example.semana7.entity.GerenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// o Repositório GerenteRepository recebe todos os métodos de JpaRepository
// a tabela de referencia desse repositório é a GerenteEntity
// o ID da GerenteEntity é de tipo Long
public interface GerenteRepository extends JpaRepository<GerenteEntity,Long> {

    @Query(
            " SELECT g FROM GerenteEntity g" +
            " where g.nome = :nome"
    )
    List<GerenteEntity> findAllGerenteEntityByName(@Param("nome") String nome);

    @Query(
            " SELECT g.filial FROM GerenteEntity g" +
                    " where g.nome = :nome"
    )
    List<GerenteEntity> findAllFiliaisByGerenteEntityByName(@Param("nome") String nome);

    @Query(
            " SELECT g FROM GerenteEntity g" +
                    " where g.filial.nome = :nome" // ":" identifica uma variável
    )
    List<GerenteEntity> rogerio(@Param("nome") String nome);

    @Query( //jpql
            " update GerenteEntity g " +
            " set g.nome = :nome" +
            " where g.id = :id"
    )
    void updateNomeById(@Param("nome") String nome, @Param("id") String id);

    @Query( // sql
            value = " SELECT * FROM gerente g" +
                    " where g.nome = :nome",
            nativeQuery = true
    )
    List<GerenteEntity> findGerentesByNameNative(@Param("nome") String nome);


}
