import model.Aluno;
import model.Emprestimo;
import model.GerenciarEmprestimo;
import model.Livro;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Dudu", "102320",
                    15, LocalDate.of(2009, 1, 8),
                    "Marcela", "77-988046711"
                );
        Aluno aluno2 = new Aluno("Aidetico", "112320",
                16, LocalDate.of(2008, 2, 10),
                "Dimas", "77-988626711"
        );

        Livro livro1 = new Livro(
                "A flor é para todos", "Juliana", "Extendo",
                LocalDate.of(2001, 1, 2),
                342, "1-FFOOOBSAJ", 3, 10
        );

        Livro livro2 = new Livro(
                "A ausência do ser", "Julia", "Extendo",
                LocalDate.of(2003, 10, 22),
                347, "1-FFO11BSAJ", 1, 20
        );

        Emprestimo emp1 = new Emprestimo(aluno1, livro1);
        Emprestimo emp2 = new Emprestimo(aluno2, livro1);

        GerenciarEmprestimo gerenciador = new GerenciarEmprestimo();
        gerenciador.realizarEmprestimo(emp1);
        gerenciador.realizarEmprestimo(emp2);

        System.out.println(gerenciador.toString());

    }
}