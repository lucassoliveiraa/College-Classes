import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> objetos = new LinkedList<T>();
    private int totalDeElementos = 0;

    public void insere(T t) {
        this.objetos.add(t);
        totalDeElementos++;
    }

    public T remove() {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha está vazia!");
        }
        return this.objetos.removeLast();
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }

    public int verificaElemento(T t) {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha está vazia!");
        }   
        Pilha<T> novo = new Pilha<T>();
        int ct = -1;
        for (int i = 0; i < this.tamanho(); i++) {
            if (this.objetos.get(i) != t) {
                novo.insere(this.remove());
            } else {
                ct = i;
                break;
            } 
        }
        for(int i = 0; i < this.tamanho(); i++) {
            this.insere(novo.remove());
        }
        return ct;
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public String toString() {
        return this.objetos.toString();
    }
}
