package model;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private String nomeResponsavel;
    private String numResponsavel;
    private int cotas;
    public Aluno(String nome, String codigo, int idade, LocalDate dataNascimento,
                 String nomeResponsavel, String numResponsavel) {
        super(nome, codigo, idade, dataNascimento);
        this.nomeResponsavel = nomeResponsavel;
        this.numResponsavel = numResponsavel;
        this.cotas = Cotas.getQtdCotasAluno();
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

    public int getCotas() {
        return cotas;
    }

    public void setCotas(int cotas) {
        this.cotas = Cotas.getQtdCotasAluno() - cotas;
        Cotas.setQtdCotasAluno(Cotas.getQtdCotasAluno() - cotas);
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", codMatricula='" + getCodigo() + '\'' +
                '}';
    }
}
