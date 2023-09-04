/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torre;

import java.util.LinkedList;

/**
 *
 * @author lucas
 */
public class Pilha<T> {
    private LinkedList<T> objetos = new LinkedList<T>();

    public void insere(T obj) 
    {
        this.objetos.add(obj);
    }

    public T remove() 
    {
        if (this.vazia()) 
        {
            throw new IllegalArgumentException("Pilha this.vazia");
        }
        return this.objetos.removeLast();
    }

    public T olha() 
    {
        if (this.vazia()) 
        {
            throw new IllegalArgumentException("Pilha this.vazia");
        }
        return this.objetos.getLast();
    }

    public int verificaElemento(T obj) 
    {
        if (this.vazia()) {
            throw new IllegalArgumentException("Pilha Vazia");
        }
        Pilha<T> nova = new Pilha<T>();
        int ct = -1;
        System.out.println(this);
        int tamanhoInicial = this.tamanho();
        T atual = this.remove();

        //Desempilho e comparo
        for (int i = 0; i < tamanhoInicial; i++) 
        {   
            nova.insere(atual);
            if (!atual.equals(obj)) {
                atual = this.remove();     
            } else {
                ct = i;
                break;
            }    
        }
        
        //Empilho
        System.out.println(nova);
        this.insere(nova.remove());
        while(!nova.vazia()){
            this.insere(nova.remove());
        }
        return ct;
    }

    public boolean vazia() 
    {
        return this.tamanho() == 0;
    }

    public int tamanho() 
    {
        return this.objetos.size();
    }

    public String toString() 
    {
        return this.objetos.toString();
    }
}
