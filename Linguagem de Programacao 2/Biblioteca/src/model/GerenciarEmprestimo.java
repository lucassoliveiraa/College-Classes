package model;

import java.util.ArrayList;

public class GerenciarEmprestimo {
    private ArrayList<Emprestimo> emprestimosRealizados = new ArrayList<>();
    private void realizarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getAluno().getCotas().getQtdCotas() != 0) {
            emprestimosRealizados.add(emprestimo);
            emprestimo.getAluno().getCotas().setQtdCotas(
                    emprestimo.getAluno().getCotas().getQtdCotas() - 1
            );
        }
    }
}
