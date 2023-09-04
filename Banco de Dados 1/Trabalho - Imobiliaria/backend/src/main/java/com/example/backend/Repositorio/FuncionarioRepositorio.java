package com.example.backend.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.Modelo.Funcionario;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Integer>{
    
}
