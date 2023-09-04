package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Tipo;

public interface TipoRepositorio extends JpaRepository<Tipo, Integer> {
    
}
