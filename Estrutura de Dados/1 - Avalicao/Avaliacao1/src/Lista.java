public class Lista<Tipo> {
    private No primeiro;
    private No ultimo;
    private int totalElementos = 0;

    /* Funções
    * Tamanho
    * posicaoValidaParaInserir
    * posicaoValidaParaRemover
    * pegaNo
    * adicionar
    * remover
    * */


    public int tamanho() {
        return this.totalElementos;
    }
    public boolean posicaoValidaParaRemover(int posicao) {
        return posicao >= 0 && posicao < this.totalElementos;
    }

    public boolean posicaoValidaParaInserir(int posicao) {
        return posicao >= 0 && posicao <= this.totalElementos;
    }

    public No pegaNo(int posicao) {
        if (!this.posicaoValidaParaRemover(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No<Tipo> atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }
    public void adiciona(Tipo elemento, int posicao) {
        No<Tipo> novo = new No<Tipo>(elemento);
        if (this.posicaoValidaParaInserir(posicao)) {
            if (this.totalElementos == 0) {
                this.primeiro = novo;
                this.ultimo = novo;
                this.primeiro.setProximo(novo);
            }
            if (posicao == 0) {
                this.ultimo.setProximo(novo);
                novo.setProximo(this.primeiro);
                this.primeiro = novo;
            } else {
                if (posicao == this.totalElementos) {
                    novo.setProximo(this.primeiro);
                    this.ultimo.setProximo(novo);
                    this.ultimo = novo;
                } else {
                    No<Tipo> anterior = this.pegaNo(posicao - 1);
                    No<Tipo> posterior = anterior.getProximo();
                    novo.setProximo(posterior);
                    anterior.setProximo(novo);
                }
            }
            this.totalElementos++;
        }
    }

    public void remover(int posicao) {
        if (this.posicaoValidaParaRemover(posicao)) {
            if (this.totalElementos == 1) {
                this.primeiro = null;
                this.ultimo = null;
            }
            else {
                if (posicao == 0) {
                    this.primeiro = this.primeiro.getProximo();
                    this.ultimo.setProximo(primeiro);
                } else {
                    if (posicao == this.totalElementos - 1) {
                        No<Tipo> anterior = this.pegaNo(posicao - 1);
                        this.ultimo = anterior;
                        this.ultimo.setProximo(this.primeiro);
                    } else {
                        No<Tipo> anterior = this.pegaNo(posicao - 1);
                        No<Tipo> elementoRemover = anterior.getProximo();

                        anterior.setProximo(elementoRemover.getProximo());
                        elementoRemover.setProximo(null);
                    }
                }
            }
            this.totalElementos--;
        }
    }

    public Tipo get(int posicao) {
        return (Tipo) pegaNo(posicao).getElemento();
    }

    public String toString() {
        if (this.totalElementos == 0) {
            return "[]";
        }
        No<Tipo> atual = this.primeiro;
        StringBuilder retorno = new StringBuilder();
        retorno.append("[ ");

        for (int i = 0; i < this.totalElementos; i++) {
            retorno.append(atual.getElemento());
            atual = atual.getProximo();

            if (atual != null && i < totalElementos - 1)  {
                retorno.append(", ");
            }
        }
        retorno.append(" ]");
        return retorno.toString();
    }
}
