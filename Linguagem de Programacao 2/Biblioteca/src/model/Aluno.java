package model;

import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String codMatricula;
    private int idade;
    private LocalDate dataNascimento;
    private String nomeResponsavel;
    private String numResponsavel;
    private Cotas cotas;
    public Aluno(String nome, String codMatricula, int idade, LocalDate dataNascimento,
                 String nomeResponsavel, String numResponsavel) {
        this.nome = nome;
        this.codMatricula = codMatricula;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.nomeResponsavel = nomeResponsavel;
        this.numResponsavel = numResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public int getIdade() {
        return idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public String getNumResponsavel() {
        return numResponsavel;
    }
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public void setNumResponsavel(String numResponsavel) {
        this.numResponsavel = numResponsavel;
    }

    public Cotas getCotas() {
        return cotas;
    }

    public void setCotas(Cotas cotas) {
        this.cotas = cotas;
    }
}
