package com.example.semana7.service;

import com.example.semana7.controller.dto.FilialRequest;
import com.example.semana7.controller.dto.FilialResponse;
import com.example.semana7.entity.FilialEntity;
import com.example.semana7.repository.FilialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FilialService {

    private final FilialRepository repository;

    public List<FilialResponse> buscaFiliais() {
        return repository.findAll().stream().map(
                filialEntity -> new FilialResponse(
                        filialEntity.getId(),
                        filialEntity.getNome(),
                        filialEntity.getAnosServico()
                )
        ).collect(Collectors.toList());
    }

    public FilialResponse salvaFilial(FilialRequest request) {
        FilialEntity entity = new FilialEntity();
        entity.setNome(request.getNome());
        entity.setLocalizacao(request.getLocalizacao());
        entity.setAnosServico(request.getAnosServico());

        FilialEntity entitySalva = repository.save(entity);

        return new FilialResponse(entitySalva.getId(),
                entitySalva.getNome(),
                entitySalva.getAnosServico());
    }
}
