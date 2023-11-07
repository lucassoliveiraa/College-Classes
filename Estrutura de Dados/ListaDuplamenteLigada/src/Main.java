/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author DISCENTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno("A");
        Aluno b = new Aluno("B");
        Aluno c = new Aluno("C");
        Aluno d = new Aluno("D");
        Aluno e = new Aluno("E");
        
        ListaDuplamenteLigada listaL = new ListaDuplamenteLigada();
        listaL.adiciona(a);
        listaL.adiciona(b);
        listaL.adiciona(c);
        listaL.adiciona(d);
        listaL.adiciona(e);
        System.out.println(listaL);
        
        listaL.adicionaNoComeco(d);
        System.out.println(listaL);
        
        listaL.adiciona(4, e);
        System.out.println(listaL);
        
        /*
        listaL.removeDoComeco();
        System.out.println(listaL);
        
        listaL.removeDoComeco();
        System.out.println(listaL);
        
        listaL.removeDoFim();
        System.out.println(listaL);
        */
        
        System.out.println(listaL.contem(e));
    }
}
