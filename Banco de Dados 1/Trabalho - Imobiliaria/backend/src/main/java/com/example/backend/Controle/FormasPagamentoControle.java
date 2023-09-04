package com.example.backend.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.Modelo.FormasPagamento;
import com.example.backend.Repositorio.FormasPagamentoRepositorio;

@RestController
@RequestMapping("/formaspagamento")
public class FormasPagamentoControle {
    @Autowired
    private FormasPagamentoRepositorio repository;

    @GetMapping("/listar")
    public ResponseEntity<List<FormasPagamento>> listar() {
        var lista = repository.findAll();
        return ResponseEntity.ok(lista);
    }
}
