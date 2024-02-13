/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class ListaLigada {
    private No primeiro;
    private No ultimo;
    private int totalDeElmentos = 0;
    
    public void adiciona(Object elemento) {
        if(this.totalDeElmentos == 0) {
            adicionaComeco(elemento);
        } else {
            No novo = new No(elemento);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            this.totalDeElmentos++;
        }  
    }
    
    
    public void adicionaComeco(Object elemento) {
        /*
        Cria um novo objeto do tipo No que tem como atributos iniciais, o endereço
        de memoria e o elemento objeto
        */
        No novo = new No(this.primeiro, elemento);
        this.primeiro = novo;
        
        if(this.totalDeElmentos == 0) {
            this.ultimo = this.primeiro;
        }
        this.totalDeElmentos++;
    }
    
    public int tamanho() {
        return this.totalDeElmentos;
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElmentos;
    }
    
    public String toString() {
        
        if(this.totalDeElmentos == 0) {
            return "[]";
        }
        No atual = this.primeiro;
        String retorno = "[ ";
        while(atual.getProximo() != null) {
            retorno += atual.getElemento();
            atual = atual.getProximo();
            
            if(atual != null) {
                retorno += ", ";
            }
        }
        retorno += " ]";
        return retorno;
    }
}
