/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class No {
    private No proximo;
    private Object elemento;
    
    public No(No proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }
    
    public No(Object elemento) {
        this.elemento = elemento;
    }
    
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public No getProximo() {
        return proximo;
    }
    
    public Object getElemento() {
        return elemento;
    }
}
