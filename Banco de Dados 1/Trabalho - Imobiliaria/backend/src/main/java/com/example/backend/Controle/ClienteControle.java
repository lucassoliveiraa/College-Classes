package com.example.backend.Controle;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Modelo.Cliente;
import com.example.backend.Repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/cliente")
public class ClienteControle {

    @Autowired
    private ClienteRepositorio repository;

    @GetMapping
    private ResponseEntity<List<Cliente>> listar(){
        var lista = repository.findAll();
        return ResponseEntity.ok(lista);
    }
}
