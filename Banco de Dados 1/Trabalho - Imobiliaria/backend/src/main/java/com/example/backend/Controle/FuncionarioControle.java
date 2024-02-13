package com.example.backend.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Modelo.Funcionario;
import com.example.backend.Repositorio.FuncionarioRepositorio;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioControle {
    @Autowired
    private FuncionarioRepositorio repository;

    @GetMapping("/listar")
    public ResponseEntity<List<Funcionario>> listar() {
        var lista = repository.findAll();
        return ResponseEntity.ok(lista);
    }
}
