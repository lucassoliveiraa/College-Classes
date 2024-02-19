package model;

import java.util.ArrayList;

public class GerenciarEmprestimo {
    private ArrayList<Emprestimo> emprestimosRealizados = new ArrayList<>();
    public void realizarEmprestimo(Emprestimo emprestimo) {
        if (!(emprestimo.getAluno().getCotas() != 0)) {
            System.out.println("Aluno " + emprestimo.getAluno().getNome() + " não possui cotas suficientes!");
        }else if (!(emprestimo.getLivro().getQtdLivros() != 0)) {
            System.out.println("Livro " + emprestimo.getLivro().getTitulo() + " não possuí " +
                    "mais nenhum exemplar no acervo");
        } else {
            emprestimosRealizados.add(emprestimo);
            emprestimo.getAluno().setCotas(1);
            emprestimo.getLivro().setQtdLivros(
                    emprestimo.getLivro().getQtdLivros() - 1
            );
            System.out.println("Emprestimo realizado!\n" +
                                " Nome: " + emprestimo.getAluno().getNome() + "\n"
                                + " Código: " + emprestimo.getLivro().getTitulo()
            );
        }
    }

    public void devolverEmprestimo(Emprestimo emprestimo) {
        if (emprestimosRealizados.contains(emprestimo)) {
            emprestimosRealizados.remove(emprestimo);
            emprestimo.getAluno().setCotas(1);
            emprestimo.getLivro().setQtdLivros(emprestimo.getLivro().getQtdLivros() - 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("[ " + "\n");
        for (int i = 0; i < emprestimosRealizados.size(); i++) {
            Emprestimo emprestimo = emprestimosRealizados.get(i);
            retorno.append(i + " - Aluno: " + emprestimo.getAluno().getNome() + " | Codigo: " + emprestimo.getAluno().getCodigo() +
                    " | Livro: " + emprestimo.getLivro().getTitulo() + " | Autora: " + emprestimo.getLivro().getNomeAutora() + "\n"
            );
        }
        retorno.append("]");
        return retorno.toString();
    }
}
