import java.util.ArrayList;
import java.util.LinkedList;

public class Arvore<T extends Comparable> {
    private Elemento<T> raiz;
    private LinkedList<Palavra> elementosRepetidos = new LinkedList<Palavra>();
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
                if(!((Palavra) novoElemento.getValor()).getPalavra().equalsIgnoreCase(((Palavra) atual.getValor()).getPalavra()))
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
                    else
                    {
                        if(atual.getDireita() != null)
                        {
                            atual = atual.getDireita();
                        } else {
                            atual.setDireita(novoElemento);
                            break;
                        }
                    }
                } else {
                    elementosRepetidos.add((Palavra) novoElemento.getValor());
                    break;
                }

            }
        }
    }
    public String exibirRepet() {
        return this.elementosRepetidos.toString();
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
}
