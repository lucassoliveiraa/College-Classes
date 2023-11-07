/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DISCENTE
 */
public class ListaDuplamenteLigada {
    private No primeira;
    private No ultimo;
    private int totalDeElementos = 0;
    
    public void adiciona(Object elemento) {
        if(this.totalDeElementos == 0){
            this.adicionaNoComeco(elemento);
        } else {
            No nova = new No(elemento);
            this.ultimo.setProxima(nova);
            nova.setAnterior(this.ultimo);
            this.ultimo = nova;
            
            this.totalDeElementos++;
        }  
    }
    
    public No pegaNo(int posicao) {
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao nao existe");
        }
        No atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
    
    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
        } else if(posicao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            No anterior = this.pegaNo(posicao - 1);
            No proxima = anterior.getProxima();
            No nova = new No(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            this.totalDeElementos++;
        }
    }
    
    public void adicionaNoComeco(Object elemento) {
        No nova = new No(this.primeira, elemento);
        
        if(this.totalDeElementos > 0) {
            primeira.setAnterior(nova);
        }
        
        this.primeira = nova;
        
        if (this.totalDeElementos == 0) {
            this.ultimo = this.primeira;
        }
        this.totalDeElementos++;
    }
    
    public Object pega(int posicao) {
        return this.pegaNo(posicao).getElemento();
    }
    
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    
    
    
    public int tamanho() {
        return this.totalDeElementos;
    }
    
    public boolean contem(Object elemento) {
        No atual = this.primeira;
        
        while(atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProxima();
        }
        return false;
    }
    
    
    
    public void removeDoComeco() {
        if (!this.posicaoValida(0)) {
            throw new IllegalArgumentException("Posicao nao existe");
        }
        this.primeira = this.primeira.getProxima();
        this.primeira.setAnterior(null);
        this.totalDeElementos--;
        
        if(this.totalDeElementos == 0) {
            this.ultimo = null;
        }
    }
    
    
    //Constante
    public void removeDoFim() {
        if (!this.posicaoValida(this.totalDeElementos - 1)) {
            throw new IllegalArgumentException("Posicao nao existe");
        } else if(this.totalDeElementos == 1) {
            removeDoComeco();
        } else {
            No penultima = this.ultimo.getAnterior();
            penultima.setProxima(null);
            this.ultimo = penultima;
            this.totalDeElementos--;
        }   
    }
    
    public void remove(int posicao) {
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao nao existe");
        }
        
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeDoFim();
        } else {
            No anterior = this.pegaNo(posicao - 1);
            No atual = anterior.getProxima();
            No proxima = atual.getProxima();
            
            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
            
            this.totalDeElementos--;
        }
    }
    
    
    public String toString() {
        
        if(this.totalDeElementos == 0) {
            return "[]";
        }
        No atual = this.primeira;
        String retorno = "[ ";
        while(atual.getProxima() != null) {
            retorno += atual.getElemento();
            atual = atual.getProxima();
            
            if(atual != null) {
                retorno += ", ";
            }
        }
        retorno += atual.getElemento() + " ]";
        return retorno;
    }
}
