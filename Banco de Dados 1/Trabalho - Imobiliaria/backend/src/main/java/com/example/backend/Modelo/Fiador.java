package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "fiador")
@Table(name = "fiador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fiador {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFiador")
    private int idFiador;

    //idTransacao

    @Column(name = "nome", nullable = false)
    private String nome;
}
