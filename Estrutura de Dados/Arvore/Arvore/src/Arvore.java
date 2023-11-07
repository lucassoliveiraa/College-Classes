import java.util.ArrayList;

public class Arvore<T extends Comparable> {
    private Elemento<T> raiz;
    private ArrayList<Elemento<T>> elementosRepetidos;

    public Arvore() {
        this.raiz = null;
    }
    public Elemento<T> getRaiz(){
        return raiz;
    }
    public void adicionar(T valor) {
        Elemento<T> novoElemento = new Elemento<T>(valor);
        if (raiz == null) {
            raiz = novoElemento;
        } else {
            Elemento<T> atual = this.raiz;
            while (true)
            {
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1)
                {
                    if(atual.getEsquerda() != null)
                    {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }
                else if(novoElemento.getValor().compareTo(atual.getValor()) == 1)
                {
                    if(atual.getDireita() != null)
                    {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoElemento);
                        break;
                    }
                } //else {valoresRepetidos(novoElemento);}
                else {
                    break;
                }
            }
        }
    }
    private void valoresRepetidos(Elemento<T> val) {
        elementosRepetidos.add(val);
    }
    public String emOrdem(Elemento<T> atual){

        if (atual != null){
            return emOrdem(atual.getEsquerda()) +
                    atual.getValor() + ", " +
                    emOrdem(atual.getDireita());
        }
        else
            return "";
    }
    public String preOrdem(Elemento<T> atual){
        if (atual != null){
            return atual.getValor()+ ", " +
                    preOrdem(atual.getEsquerda()) +
                    preOrdem(atual.getDireita());
        }
        else
            return "";
    }
    public String posOrdem(Elemento<T> atual){
        if (atual != null){
            return posOrdem(atual.getEsquerda()) +
                    posOrdem(atual.getDireita()) +
                    atual.getValor()+ ", " ;
        }
        else
            return "";
    }
    public boolean remover(T valor) {

    }
}
