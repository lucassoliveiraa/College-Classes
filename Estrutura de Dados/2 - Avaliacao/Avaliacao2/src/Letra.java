public class Letra {
    private char letra;
    private int posicao;

    public Letra(char letra, int posicao) {
        this.letra = letra;
        this.posicao = posicao;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
