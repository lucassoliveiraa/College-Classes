/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class ListaCircular{
    private No primeira;
    private No ultimo;
    private int totalDeElementos = 0;
    
    public int tamanho() {
        return this.totalDeElementos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    
    public void adiciona(Object elemento) {
        No novo = new No(elemento);
        this.primeira = novo;
        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeira;
            this.primeira.setProxima(this.ultimo);
            this.ultimo.setProxima(this.primeira);
        } else {
            this.primeira.setAnterior(novo);
            novo.setProxima(this.primeira);
            this.primeira = novo;
            this.ultimo.setProxima(this.primeira);
        }
        this.totalDeElementos++;
    }
    
    public void remove() {
        if (!posicaoValida(0)) {
            throw new IllegalArgumentException("Posicao invalida");
        } 
        No penultimo = this.ultimo.getAnterior();
        penultimo.setProxima(this.primeira);
        this.ultimo.setAnterior(null);
        this.ultimo = penultimo;
        this.totalDeElementos--;
    }
    
    public ListaCircular intercalar(ListaCircular l) {
        if (this.totalDeElementos == 0 && l.totalDeElementos == 0) {
            throw new IllegalArgumentException("Listas vazias");
        }
        ListaCircular listaN = new ListaCircular();
        No l1 = this.primeira;
        No l2 = l.primeira;
        while(l1.getProxima() != null || l2.getProxima() != null) {
            listaN.adiciona(l1.getElemento());
            listaN.adiciona(l2.getElemento());
            l1 = l1.getProxima();
            l2 = l2.getProxima();
        }
        while (l1 != null) {
            listaN.adiciona(l1.getElemento());
            l1 = l1.getProxima();
        }
        while (l2 != null) {
            listaN.adiciona(l2.getElemento());
            l2 = l2.getProxima();
        }
        return listaN;
    }
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        No atual = this.primeira;
        String retorno = "[ ";
        
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            retorno += atual.getElemento();
            atual = atual.getProxima();
            
            if (atual != null) {
                retorno += ", ";
            }
        }
        retorno += atual.getElemento() + " ]";
        return retorno;
    }
}
