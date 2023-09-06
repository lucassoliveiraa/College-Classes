import java.util.LinkedList;

public class Pilha<Tipo> {
    private LinkedList<Tipo> objetos = new LinkedList<Tipo>();
    private int totalDeElementos = 0;

    public void empilhar(Tipo objeto) {
        this.objetos.add(objeto);
        this.totalDeElementos++;
    }

    public Tipo desempilhar() {
        if (vazia()) {
            throw new IllegalArgumentException("Pilha Vazia");
        }
        this.totalDeElementos--;
        return this.objetos.removeLast();
    }

    public Tipo olhaTopo() {
        if (vazia()) {
            throw new IllegalArgumentException("Pilha vazia");
        }
        return this.objetos.getLast();
    }

    public boolean vazia() {
        return this.totalDeElementos == 0;
    }
    public int tamanho() {
        return this.totalDeElementos;
    }
}
