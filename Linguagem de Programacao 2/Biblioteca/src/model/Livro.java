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
}
