/**
 * FilaObject
 */
import java.util.LinkedList;;

public class FilaObject {

    private LinkedList<Object> objetos = new LinkedList<Object>();


	public void insere(Object objeto) {
		this.objetos.add(objeto);
	}

	public Object remove() {
		return this.objetos.remove(0);
	}

	public boolean vazia() {
		return this.objetos.size() == 0;
	}

	public int tamanho() {
		return this.objetos.size();
	}

	public Object espia() {
		if (vazia()) {
			throw new IllegalArgumentException("FilaGenerics vazia");
		}
		return this.objetos.get(0);
	}

	public int verificaobjeto(Object objeto) {
		if (vazia()) {
			throw new IllegalArgumentException("FilaGenerics vazia");
		}
		FilaGenerics<Object> nova = new FilaGenerics<Object>();
		Object atual;
		int cont = -1;

		while(!this.vazia()) {
			atual = this.remove();
			cont++;
			nova.insere(atual);
			if (atual.equals(objeto)) {
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