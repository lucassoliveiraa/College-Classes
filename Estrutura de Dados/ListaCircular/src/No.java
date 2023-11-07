/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DISCENTE
 */
public class No {
    private No proxima;
    private No anterior;
    
    private Object elemento;
    
    public No(No proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }
    
    public No(Object elemento) {
        this.elemento = elemento;
    }
    
    public void setProxima(No proxima) {
        this.proxima = proxima;
    }
    
    public No getProxima() {
        return proxima;
    }
    
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    public No getAnterior() {
        return anterior;
    }
    
    public Object getElemento() {
        return elemento;
    }
}
