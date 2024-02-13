package com.example.backend.Modelo;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "funcionario")
@Table(name = "funcionario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFunc")
    private int idFunc;

    @OneToOne
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo")
    private Cargo idCargo;

    @Column(name = "CPF", nullable = false)
    private String CPF;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "telefone1", nullable = false)
    private String telefone1;

    @Column(name = "telefone2")
    private String telefone2;

    @Column(name = "dataIngresso", nullable=false)
    private Date dataIngresso;

    @Column(name = "porComissao", nullable = false)
    private float porComissao;

    @Column(name = "usuario", nullable = false)
    private String usuario;

    @Column(name = "senha", nullable = false)
    private String senha;
}
