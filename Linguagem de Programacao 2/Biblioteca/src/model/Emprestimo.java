package model;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private Aluno aluno;
    private Livro livro;
    private Emprestimo(Aluno aluno, Livro livro) {
        this.aluno = aluno;
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Livro getLivro() {
        return livro;
    }
}
