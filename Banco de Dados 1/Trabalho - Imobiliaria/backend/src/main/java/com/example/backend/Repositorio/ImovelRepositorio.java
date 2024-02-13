package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Imovel;

public interface ImovelRepositorio extends JpaRepository<Imovel, Integer> {
    
}
