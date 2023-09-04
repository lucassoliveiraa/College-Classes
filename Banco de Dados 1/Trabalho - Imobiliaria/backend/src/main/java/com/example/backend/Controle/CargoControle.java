package com.example.backend.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Modelo.Cargo;
import com.example.backend.Repositorio.CargoRepositorio;


@RestController
@RequestMapping("/cargo")
public class CargoControle {
    @Autowired
    private CargoRepositorio repositorio;
    @GetMapping
    public ResponseEntity<List<Cargo>> listar() {
        var lista = repositorio.findAll();
        return ResponseEntity.ok(lista);
    }
}
