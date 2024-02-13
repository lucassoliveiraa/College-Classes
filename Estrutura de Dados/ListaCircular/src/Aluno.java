/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private String turma;

    public Aluno() {
      
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public Aluno(String nome, int idade, double nota, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String toString() {
        return this.getNome();
    }
  
    public boolean equals(Object outro) {
        
        return this.nome.equals( ((Aluno) outro).getNome() );
    }   
}
