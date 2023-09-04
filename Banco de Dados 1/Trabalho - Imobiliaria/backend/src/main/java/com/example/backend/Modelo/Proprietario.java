package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "proprietario")
@Table(name = "proprietario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Proprietario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProp", nullable = false)
    private int idProp;

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

    public Proprietario(int idProp) {
        this.idProp = idProp;
    }
}
