package com.example.backend.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "formaspagamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FormasPagamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFormas", nullable = false)
    private int idFormas;

    @Column(name = "nome", nullable = false)
    private String nome;
}
