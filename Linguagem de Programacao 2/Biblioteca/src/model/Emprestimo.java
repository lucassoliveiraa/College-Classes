package model;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private Aluno aluno;
    private Livro livro;
    public Emprestimo(Aluno aluno, Livro livro) {
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
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

    @Override
    public String toString() {
        return "Emprestimo{" +
                "aluno=" + aluno +
                ", livro=" + livro +
                '}';
    }
}
