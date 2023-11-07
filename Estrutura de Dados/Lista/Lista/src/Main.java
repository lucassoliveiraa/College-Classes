/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro");
        Aluno a2 = new Aluno("João");
        Aluno a3 = new Aluno("Pacheco");
        Aluno a4 = new Aluno("Luiz");
        Aluno a5 = new Aluno("Augusto");
        Aluno a6 = new Aluno("Sasda");
        Aluno a7 = new Aluno("Paka");
        
        Lista lista = new Lista();
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(a7);
        
        System.out.println(lista);
        System.out.println(lista.contem(a3)); 
        System.out.println(lista.tamanho());
    }
    
}
