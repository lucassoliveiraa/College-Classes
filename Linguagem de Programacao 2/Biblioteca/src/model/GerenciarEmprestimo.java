package model;

import java.util.ArrayList;

public class GerenciarEmprestimo {
    private ArrayList<Emprestimo> emprestimosRealizados = new ArrayList<>();
    public void realizarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getAluno().getCotas() != 0) {
            if (emprestimo.getLivro().getQtdLivros() != 0) {
                emprestimosRealizados.add(emprestimo);
                emprestimo.getAluno().setCotas(emprestimo.getAluno().getCotas() - 1);
                emprestimo.getLivro().setQtdLivros(
                        emprestimo.getLivro().getQtdLivros() - 1
                );
            }
        }
    }

    @Override
    public String toString() {
        return "GerenciarEmprestimo{" +
                "emprestimosRealizados=" + emprestimosRealizados +
                '}';
    }
}
