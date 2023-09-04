package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "indicacao")
@Table(name = "indicacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Indicacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInd")
    private int idInd;


    @Column(name = "nome", nullable = false)
    private String nome;
}
