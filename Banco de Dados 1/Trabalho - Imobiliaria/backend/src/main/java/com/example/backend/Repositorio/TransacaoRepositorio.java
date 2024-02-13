package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Transacao;

public interface TransacaoRepositorio extends JpaRepository<Transacao, Integer> {
    
}
