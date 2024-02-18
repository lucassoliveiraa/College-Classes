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

    //Criar função para devolução de livro e incremento da qtd livros e qtd cotas do aluno
    //Criar função para adicionar uma lista de livros para um aluno apenas

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("[ " + "\n");
        for (int i = 0; i < emprestimosRealizados.size(); i++) {
            Emprestimo emprestimo = emprestimosRealizados.get(i);
            retorno.append(i + " - Aluno: " + emprestimo.getAluno().getNome() + " | Cod Matricula: " + emprestimo.getAluno().getCodigo() +
                    " | Livro: " + emprestimo.getLivro().getTitulo() + " | Autora: " + emprestimo.getLivro().getNomeAutora() + "\n"
            );
        }
        retorno.append("]");
        return retorno.toString();
    }
}
