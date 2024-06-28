package com.example.semana7.controller;

import com.example.semana7.controller.dto.FilialRequest;
import com.example.semana7.controller.dto.FilialResponse;
import com.example.semana7.service.FilialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/filial")
@RequiredArgsConstructor // cria um construtor apenas com os atributos final
public class FilialController {

    private final FilialService filialService;

    @GetMapping
    public ResponseEntity<List<FilialResponse>> getFiliais() {
        List<FilialResponse> response = filialService.buscaFiliais();

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<FilialResponse> postFiliais(
            @RequestBody FilialRequest request
    ) {
        FilialResponse response = filialService.salvaFilial(request);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
        // status 201, e no corpo de resposta vai ter o FilialResponse
    }
}
