package com.example.semana7.repository;

import com.example.semana7.entity.GerenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// o Repositório GerenteRepository recebe todos os métodos de JpaRepository
// a tabela de referencia desse repositório é a GerenteEntity
// o ID da GerenteEntity é de tipo Long
public interface GerenteRepository extends JpaRepository<GerenteEntity,Long> {
}
