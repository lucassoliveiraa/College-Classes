import javax.swing.JOptionPane;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static boolean primeiraJogada = true;
    static Pilha<Disco> pilha1 = new Pilha<Disco>();
    static Pilha<Disco> pilha2 = new Pilha<Disco>();
    static Pilha<Disco> pilha3 = new Pilha<Disco>();
    static LinkedList<Pilha<Disco>> lista = new LinkedList<Pilha<Disco>>();
    static int ct = 0;
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        int qtd;
    
        while (true)  {
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de discos: "));
            if (qtd >= 3 && qtd <= 15) 
            {
                int i = 1;
                while (i <= qtd) {
                    pilha1.insere(new Disco(""+i, i));
                    i++;
                    break;
                }
                lista.add(pilha1);
            }
        }
        Jogada();
    }
        
        

    public static void Jogada() 
    {
        int origem, destino; //Pilhas
        boolean ganhou = false;
        while(!ganhou) {
            System.out.println("Digite o pino de origem");
            origem = sc.nextInt();
            System.out.println("Digite o pino de destino");
            destino = sc.nextInt();
            
            if (ct == 0) 
            {  
                ct++;
                primeiraJogada = false;
                if (destino == 2) {
                    pilha2.insere(pilha1.remove());
                    lista.add(pilha2);
                } else if (destino == 3) {
                    pilha3.insere(pilha1.remove());
                    lista.add(pilha3);
                }
            } else {
                ct++;
                if (origem == 1) 
                {
                    if (destino == 2) {
                        pilha2.insere(pilha1.remove());
                        lista.add(pilha2);
                    } else if (destino == 3) {
                        pilha3.insere(pilha1.remove());
                        lista.add(pilha3);
                    }
                } else if(origem == 2) 
                {
                    if (destino == 1) {
                        pilha1.insere(pilha2.remove());
                        lista.add(pilha1);
                    } else if (destino == 3) {
                        pilha3.insere(pilha2.remove());
                        lista.add(pilha3);
                    }
                } else if(origem == 3) {
                    if (destino == 2) {
                        pilha2.insere(pilha3.remove());
                        lista.add(pilha2);
                    } else if (destino == 1) {
                        pilha1.insere(pilha3.remove());
                        lista.add(pilha1);
                    }
                } else {
                    System.out.println("Movimento inválido");
                }
            }
            System.out.println("Pilha 1: " + pilha1 + "\n" +
                               "Pilha 2: " + pilha2 + "\n" +
                               "Pilha 3: " + pilha3 + "\n");

            if (lista.get(1).vazia() && lista.get(2).vazia()) 
            {
                ganhou = true;
            }
        }
    }
}
