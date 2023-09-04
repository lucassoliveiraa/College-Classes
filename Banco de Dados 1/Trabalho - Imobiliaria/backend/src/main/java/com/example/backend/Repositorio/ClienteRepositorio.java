package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    
}
