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
        Aluno a = new Aluno("A");
        Aluno b = new Aluno("B");
        Aluno c = new Aluno("C");
        Aluno d = new Aluno("D");
        Aluno e = new Aluno("E");
        
        Aluno f = new Aluno("F");
        Aluno g = new Aluno("G");
        Aluno h = new Aluno("H");
        
        ListaCircular lista = new ListaCircular();
        lista.adiciona(a);
        lista.adiciona(b);
        lista.adiciona(c);
        lista.adiciona(d);
        lista.adiciona(e);
        
        
        ListaCircular l2 = new ListaCircular();
        l2.adiciona(f);
        l2.adiciona(g);
        l2.adiciona(h);
        
        lista.intercalar(l2);
        System.out.println(lista);
    }
}
