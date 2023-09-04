/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torre;

/**
 *
 * @author lucas
 */
public class Disco {
    private String cor;
    private int tamanho;

    public Disco(String cor, int tamanho) 
    {
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    public String getCor() {
        return cor;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public String toString()
    {   
        return "{" + "Cor: " + this.cor.toString() + ", Tamanho: " + this.tamanho + " }";
    }
}
