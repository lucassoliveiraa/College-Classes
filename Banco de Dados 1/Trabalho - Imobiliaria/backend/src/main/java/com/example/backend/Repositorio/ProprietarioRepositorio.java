package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Proprietario;

public interface ProprietarioRepositorio extends JpaRepository<Proprietario, Integer> {
    
}
