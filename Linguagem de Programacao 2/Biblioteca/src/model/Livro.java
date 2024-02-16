package model;

import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String nomeAutora;
    private String editora;
    private LocalDate anoDePublicação;
    private int paginas;
    private String ISBN;

    private int edicao;
    private int qtdLivros;

    public Livro(String titulo, String nomeAutora, String editora, LocalDate anoDePublicação,
                 int paginas, String ISBN, int edicao, int qtdLivros) {
        this.titulo = titulo;
        this.nomeAutora = nomeAutora;
        this.editora = editora;
        this.anoDePublicação = anoDePublicação;
        this.paginas = paginas;
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.qtdLivros = qtdLivros;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeAutora() {
        return nomeAutora;
    }

    public String getEditora() {
        return editora;
    }

    public LocalDate getAnoDePublicação() {
        return anoDePublicação;
    }
    public int getPaginas() {
        return paginas;
    }
    public String getISBN() {
        return ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", nomeAutora='" + nomeAutora + '\'' +
                ", qtdLivros=" + qtdLivros +
                '}';
    }
}
