package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Cargo;

public interface CargoRepositorio extends JpaRepository<Cargo, Integer> {
    
}
