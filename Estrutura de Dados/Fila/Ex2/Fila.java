import java.util.LinkedList;

public class Fila<T> {
	private LinkedList<T> objetos = new LinkedList<T>();


	public void insere(T elemento) {
		this.objetos.add(elemento);
	}

	public T remove() {
		return this.objetos.remove(0);
	}

	public boolean vazia() {
		return this.objetos.size() == 0;
	}

	public int tamanho() {
		return this.objetos.size();
	}

	public T espia() {
		if (vazia()) {
			throw new IllegalArgumentException("Fila vazia");
		}
		return this.objetos.get(0);
	}

	public int verificaElemento(T elemento) {
		if (vazia()) {
			throw new IllegalArgumentException("Fila vazia");
		}
		Fila<T> nova = new Fila<T>();
		T atual;
		int cont = -1;

		while(!this.vazia()) {
			atual = this.remove();
			cont++;
			nova.insere(atual);
			if (atual.equals(elemento)) {
				break;	
			} 	
		}
		while(!nova.vazia()) {
			this.insere(nova.remove());
		}
		return cont;
	}

	public String toString() {
        return this.objetos.toString();
    }
}