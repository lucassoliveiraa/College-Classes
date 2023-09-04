import java.io.Serializable;


public class Palavra implements Serializable, Comparable {
    private String palavra = "";
    private int tamanho;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.tamanho = palavra.length();
    }
    public int getTamanho() {
        return palavra.length();
    }

    public String getPalavra() {
        return palavra;
    }

    //Transforma a 1 letra(Caracter) em uma string para utilizar o equalsIgnoreCase
    public boolean comparaLetra(Palavra pa) {
        String pPalavra = Character.toString(this.getPalavra().charAt(0));
        String pAtual = Character.toString(pa.getPalavra().charAt(0));

        return pPalavra.equalsIgnoreCase(pAtual);
    }
    @Override
    public boolean equals(Object palavra) {
        return this.palavra.equalsIgnoreCase(((Palavra) palavra).getPalavra());
    }

    @Override
    public String toString() {
        return palavra;
    }
    @Override
    public int compareTo(Object palavra) {
        if (this.tamanho < ((Palavra) palavra).getTamanho()) {
            return -1;
        }
        if (this.tamanho > ((Palavra) palavra).getTamanho()) {
            return 1;
        }
        return 0;
    }
}
