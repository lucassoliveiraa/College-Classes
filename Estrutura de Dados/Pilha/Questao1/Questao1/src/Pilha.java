import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> objetos = new LinkedList<T>();

    public void insere(T t) {
        this.objetos.add(t);
    }

    public T remove() {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha está vazia!");
        }
        return this.objetos.removeLast();
    }

    public boolean vazia() {
        return this.tamanho() == 0;
    }

    //Logica de Clesio
    public int verificaElemento(T t) {
        Pilha<T> aux = new Pilha<T>();
        int cont = -1;
        boolean encontrou = false;
        T atual = remove();

        while (atual != null) {
            aux.insere(atual);
            cont++;

            if (atual.equals(t)) {
                encontrou = true;
                break;
            }
            atual = remove(); //Buscar o proximo
        }
        for(int i = 0; i < aux.tamanho(); i++) {
            insere(aux.remove());
        }
        if (encontrou) {
            return cont;
        } else {
            return -1;
        }
    }

    
    //Considerando que o topo é diferente de 0
    public int verificaElemento1(T t) {
           
        Pilha<T> novo = new Pilha<T>();
        int ct = -1;
        for (int i = this.tamanho() - 1; i >= 0; i--) {
            if (this.equals(t)) {
                ct = i;
                break;
            } else {
                novo.insere(this.remove());
            } 
        }
        for(int i = novo.tamanho() - 1; i >= 0; i--) {
            this.insere(novo.remove());
        }
        if (ct == -1) {
            System.out.println("Elemento nao esta na pilha!");
        }
        return ct;
    }

    //Considerando que o topo é igual a 0
    public int verificaElemento2(T t) {
        if (this.vazia()) {
            throw new IllegalArgumentException("Lista vazia!!");
        }   
        Pilha<T> novo = new Pilha<T>();
        int ct = -1;
        T atual = remove();
        for (int i = 0; i < this.tamanho(); i++) {
            if (atual.equals(t)) {
                ct = i;
                break;
            } else {
                novo.insere(this.remove());
            } 
        }
        for(int i = 0; i < novo.tamanho(); i++) {
            this.insere(novo.remove());
        }
        if (ct == -1) {
            System.out.println("Elemento nao esta na pilha!");
        }
        return ct;
    }

    public int tamanho() {
        return this.objetos.size();
    }

    public String toString() {
        return this.objetos.toString();
    }
}
