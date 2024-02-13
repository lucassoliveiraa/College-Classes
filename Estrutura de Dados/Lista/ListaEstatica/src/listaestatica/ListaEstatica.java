/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaestatica;

/**
 *
 * @author lucasdeoliveira
 */
public class ListaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        
        a1.setNome("Pedro");
        a2.setNome("João");
        a3.setNome("Pacheco");
        a4.setNome("Augusto");
        
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(2, a4);
        
        System.out.println(lista.taVazia());
        System.out.println(lista);
        System.out.println(lista.contem(a3)); 
        System.out.println(lista.tamanho());
    }
}
