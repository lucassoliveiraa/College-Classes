package com.example.backend.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.Modelo.Proprietario;
import com.example.backend.Repositorio.ProprietarioRepositorio;

@RestController
@RequestMapping("/proprietario")
@CrossOrigin(origins = "http://localhost:5173")
public class ProprietarioControle {
    @Autowired
    private ProprietarioRepositorio repository;

    @GetMapping("/listar")
    public ResponseEntity<List<Proprietario>> listar() {
        var proprietarios = repository.findAll();
        return ResponseEntity.ok(proprietarios);
    }
    @PostMapping("/cadastrar")
    public Proprietario cadastrar(@RequestBody Proprietario obj) {
        return repository.save(obj);
    }
}
