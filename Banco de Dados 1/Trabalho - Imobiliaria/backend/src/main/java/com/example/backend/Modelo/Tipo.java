package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity(name = "tipo")
@Table(name = "tipo")
@EqualsAndHashCode(of = "idTipo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tipo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipo", nullable = false)
    private int idTipo;

    @Column(name = "nome", nullable = false)
    private String nome;

    public Tipo(int idTipo) {
        this.idTipo = idTipo;
    }
}
