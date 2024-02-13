/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Lista {
    private Object[] objetos = new Object[3];
    
    private int totalDeObjetos = 0;
    
    //Adiciona um elemento em uma nova posição
    public void adiciona(Object objeto) {
        this.garanteEspaco();
        this.objetos[this.totalDeObjetos] = objeto;
        this.totalDeObjetos++;
    }
    
    //Garantir espaço 
    public void garanteEspaco() {
        /**Quando o total de alunos for igual ao tamanho do vetor,iremos criar um
         * novo vetor com o dobro do tamanho e tranferir os elementos do vetor lotado
         * para ele.
         */
        if(this.totalDeObjetos == this.objetos.length) {
            //Instanciando o novo vetor com o dobro do anterior
            Object[] novoArray = new Object[this.objetos.length * 2];
            
            //Transferindo os elementos do anterior com o novo vetor
            for(int i = 0; i < this.objetos.length; i++) {
                novoArray[i] = this.objetos[i];
            }
            //Com isso, fazemos o vetor anterior ser igual ao novo vetor
            this.objetos = novoArray;
        }
    }
    
    //tostring
    public String toString() {
        
        if (totalDeObjetos == 0) {
            return "[]";
        }
        String nome = "[";
        for(int i = 0; i < this.totalDeObjetos- 1; i++) {
            nome += this.objetos[i] + " , ";
        }
        
        nome += objetos[totalDeObjetos - 1] + "]";
        return nome;
    }
    
    //Retorna o tamanho
    public int tamanho() {
        return this.totalDeObjetos;
    }
    
    //Retorna se o aluno procurada esta na lista
    public boolean contem(Object objeto) {
        for(int i = 0; i < this.totalDeObjetos; i++) {
            if(objeto.equals(this.objetos[i])) {
                return true;
            }
        }
        return false;
    }
    
    //Retorna se a posicao desejada esta ou não ocupada
    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    
    //Pega um aluno da lista
    public Object pega(int posicao) {
        if(!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        return this.objetos[posicao];
    }
    
    public boolean taVazio() {
        return tamanho() == 0 ? true: false;
    }
    
    //Adiciona um elemento na posicao desejada
    public void adiciona(Object objeto, int posicao) {
        this.garanteEspaco();
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        
        //Desloca para direita, deixando a posicao vazia
        for (int i = totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i]; 
        }
        //Adiciona o elemento passado no parametro na posicao que abrimos
        this.objetos[posicao] = objeto;
        
        //Incrementa o total de alunos
        this.totalDeObjetos++;
    }
    
    //Remove o elemento na posica desejada
    public void remove(int posicao) {
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        
        //Desloca para esquerda, eliminando a posicao passada
        for(int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        
        //Decrementa o total de alunos
        this.totalDeObjetos--;
    }
}
