public class No<Tipo> {
    private No proximo;
    private Tipo elemento;

    public No(No proximo, Tipo elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No(Tipo elemento) {
        this.elemento = elemento;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public Tipo getElemento() {
        return elemento;
    }
}
