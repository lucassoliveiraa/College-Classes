package com.example.backend.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "imovel")
@Table(name = "imovel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Imovel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idImovel", nullable = false)
    private int idImovel;

    @OneToOne
    @JoinColumn(name = "idTipo", nullable = false)
    private Tipo idTipo;

    @ManyToOne
    @JoinColumn(name = "idProp", nullable = false)
    private Proprietario idProp;

    @Column(name = "qtdQuartos")
    private Integer qtdQuartos;

    @Column(name = "qtdSuites")
    private Integer qtdSuites;

    @Column(name = "qtdSalasDeEstar")
    private Integer qtdSalasDeEstar;

    @Column(name = "qtdSalasDeJantar")
    private Integer qtdSalasDeJantar;

    @Column(name = "nVagasGaragem")
    private Integer nVagasGaragem;

    @Column(name = "area")
    private Integer area;

    @Column(name = "armarioEmbutido")
    private Integer armarioEmbutido;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "andar")
    private Integer andar;

    @Column(name = "valorCondominio")
    private Float valorCondominio;

    @Column(name = "portaria24h")
    private Integer portaria24h;

    @Column(name = "qtdBanheiros")
    private Integer qtdBanheiros;

    @Column(name = "qtdComodos")
    private Integer qtdComodos;

    @Column(name = "largura")
    private Float largura;

    @Column(name = "comprimento")
    private Float comprimento;

    @Column(name = "topografia")
    private String topografia;

    @Column(name = "valor", nullable = false)
    private Float valor;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "dataCadastro", nullable = false)
    private Date dataCadastro;

    @Column(name = "disponibilidade", nullable = false)
    private String disponibilidade;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "foto")
    private String foto;

    @Column(name = "nCasa", nullable = false)
    private Integer nCasa;
}
