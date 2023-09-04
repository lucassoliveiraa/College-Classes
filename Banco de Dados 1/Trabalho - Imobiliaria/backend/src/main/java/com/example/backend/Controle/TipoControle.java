package com.example.backend.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Modelo.Tipo;
import com.example.backend.Repositorio.TipoRepositorio;

@RestController
@RequestMapping("/tipo")
public class TipoControle {
    @Autowired
    private TipoRepositorio repositorio;

    @GetMapping("/listar")
    public ResponseEntity<List<Tipo>> listar() {
        var lista = repositorio.findAll();
        return ResponseEntity.ok(lista);
    }
}
