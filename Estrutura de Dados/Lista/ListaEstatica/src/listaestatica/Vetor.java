/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaestatica;

/**
 *
 * @author lucasdeoliveira
 */
public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    
    private int totalDeAlunos = 0;
    
    public void garanteEspaco() {
        if(this.totalDeAlunos == this.alunos.length) {
            
        }
    }
    
    //Adiciona um eĺemento na última posicao + 1
    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }
    
    public String toString() {
        
        if(totalDeAlunos == 0) {
            return "[]";
        }
        String nome = "[";
        for(int i = 0; i < this.totalDeAlunos - 1; i++) {
            nome += this.alunos[i] + " , ";
        }
        
        nome += alunos[totalDeAlunos - 1] + "]";
        return nome;
    }
    
    //Retorna o tamanho da lista
    public int tamanho() {
        return this.totalDeAlunos;
    }
    
    //Verifica se o objeto está na lista
    public boolean contem(Aluno aluno) {
        for(int i = 0; i < this.totalDeAlunos; i++) {
            if(aluno.equals(this.alunos[i])) {
                return true;
            }
        }
        return false;
    }
    
    //Verifica se a posição está ocupada(Ou seja, existe o espaço)
    public boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }
    
    //
    public Aluno pega(int posicao) {
        if(!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        return this.alunos[posicao];
    }
    
    //Adiciona um novo elemento na posicao desejada
    public void adiciona(int pos, Aluno aluno) {    
        if(!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        
        for(int i = this.totalDeAlunos - 1; i >= pos; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[pos] = aluno;
        this.totalDeAlunos++;
    }
    
    //Remove o elemento da posicao indicado e move a lista para a esquerda
    public void remove(int pos) {
        if(!this.posicaoOcupada(pos)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for(int i = pos; i < this.totalDeAlunos - 1; i++){
            this.alunos[i] = this.alunos[i + 1];
        }
        this.totalDeAlunos--;
    }
    
    //Verifica se a lista está vazia
    public boolean taVazia() {
        return tamanho() == 0 ? true: false;
    }
}
