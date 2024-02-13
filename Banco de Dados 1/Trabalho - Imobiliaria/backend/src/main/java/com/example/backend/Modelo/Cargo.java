package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "cargo")
@Table(name = "cargo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCargo", nullable = false)
    private int idCargo;

    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "salarioBase", nullable = false)
    private float salarioBase;
}
