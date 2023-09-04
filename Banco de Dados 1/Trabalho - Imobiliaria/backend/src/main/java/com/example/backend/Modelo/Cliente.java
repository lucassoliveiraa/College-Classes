package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "cliente")
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private int idCliente;

    @Column(name = "CPF", nullable = false)
    private String CPF;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "numCasa", nullable = false)
    private int numCasa;

    @Column(name = "telefone1", nullable = false)
    private String telefone1;

    @Column(name = "telefone2")
    private String telefone2;

    @Column(name = "email", nullable = false)
    private String email;
}
