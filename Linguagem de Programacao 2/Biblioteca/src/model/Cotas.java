package model;

public class Cotas {
    private int qtdCotasTotal;
    private static int qtdCotasAluno;
    private static int qtdCotasProfessor;
    public Cotas(int qtdCotasTotal) {
        this.qtdCotasTotal = qtdCotasTotal;
        qtdCotasAluno = (int) (qtdCotasTotal * 0.4);
        qtdCotasProfessor = (int) (qtdCotasTotal * 0.6);
    }
    public int getQtdCotasTotal() {
        return qtdCotasTotal;
    }

    public void setQtdCotasTotal(int qtdCotasTotal) {
        this.qtdCotasTotal = qtdCotasTotal;
    }

    public static int getQtdCotasAluno() {
        return qtdCotasAluno;
    }

    public static void setQtdCotasAluno(int qtdCotasAluno) {
        Cotas.qtdCotasAluno = qtdCotasAluno;
    }

    public static void setQtdCotasProfessor(int qtdCotasProfessor) {
        Cotas.qtdCotasProfessor = qtdCotasProfessor;
    }

    public static int getQtdCotasProfessor() {
        return qtdCotasProfessor;
    }
}
