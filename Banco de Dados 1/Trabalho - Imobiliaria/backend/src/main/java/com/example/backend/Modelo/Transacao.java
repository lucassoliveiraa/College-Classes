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

@Entity(name = "transacao")
@Table(name = "transacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTra")
    private int idTra;

}
