/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torre;

import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class Torre {
    static boolean ganhou = false;
    static boolean desistir = false;
    static Pilha<Disco> pilha1 = new Pilha<Disco>();
    static Pilha<Disco> pilha2 = new Pilha<Disco>();
    static Pilha<Disco> pilha3 = new Pilha<Disco>();
    static LinkedList<Pilha<Disco>> lista = new LinkedList<Pilha<Disco>>();
    static Scanner sc = new Scanner(System.in);
    
    static int ct = 0;
    
    public static void main(String[] args) 
    {   
        String[] cores = new String[] {"Azul", "Vermelho", "Marron", "Rosa", "Verde", "Branco", "Preto", "Roxo"};
        int qtd = 0;
        while (true)  {
            System.out.print("Quantidade de discos (3 ate 8): ");
            qtd = sc.nextInt();
            if (qtd >= 3 && qtd <= 15) 
            {
                for(int i = qtd; i > 0; i--) {
                    pilha1.insere(new Disco(cores[i], i));
                }
                lista.add(pilha1);
                break;
            } else {
                System.out.println("Quantidade de discos nao permitida!");
            }
            
        }
        lista.add(pilha2);
        lista.add(pilha3);
        jogada();
    }
    
    public static void jogada()
    {
        int origem, destino; //Pilhas
        
        while(!ganhou && !desistir) {
            System.out.print("Digite o pino de origem: ");
            origem = sc.nextInt();
            System.out.print("Digite o pino de destino: ");
            destino = sc.nextInt();
           
            ct++;
            if (movimentoValido(origem, destino)) 
            {
                if (origem == 1) 
                {
                    if (destino == 2) {
                        //lista.get(1).insere(lista.get(0).remove());
                        pilha2.insere(pilha1.remove());
                    }else if (destino == 3) {
                        pilha3.insere(pilha1.remove());
                        //lista.get(2).insere(lista.get(0).remove());
                    }
                }
                else if(origem == 2) 
                {
                    if (destino == 1) {
                        //lista.get(0).insere(lista.get(1).remove());
                        pilha1.insere(pilha2.remove());
                    } else if (destino == 3) {
                        //lista.get(2).insere(lista.get(1).remove());
                        pilha3.insere(pilha2.remove());
                    }
                } 
                else if(origem == 3) {
                    if (destino == 2) {
                        //lista.get(1).insere(lista.get(2).remove());
                        pilha2.insere(pilha3.remove());
                    } else if (destino == 1) {
                        //lista.get(0).insere(lista.get(2).remove());
                        pilha1.insere(pilha3.remove());
                    }
                }
            }        
            System.out.println("Pilha 1: " + pilha1 + "\n" +
                               "Pilha 2: " + pilha2 + "\n" +
                               "Pilha 3: " + pilha3 + "\n");
            
            if (pilha1.vazia() && pilha2.vazia()) 
            {
                ganhou = true;
                System.out.println("Parabens, voce ganhou com " + ct + " tentativas");
            } else {
                opcao();
            }
        }
    }
    public static boolean opcao() {
        int opcao;
        
        System.out.println("-----------------------------------");
        System.out.print("Deseja desistir? Sim - 1 | Nao - 2 | Dica - 3 : ");
        opcao = sc.nextInt();
        if(opcao == 1) {
            desistir = true;
            System.out.println("PERDEDOR!! SUA FAMILIA AMALDICOOU O DIA EM QUE TU NASCESTE");
        } else if(opcao == 3) {
            dica();
        }
        return desistir;
    }
    
    public static void dica() {
        try {  
            if ( pilha3.olha().getTamanho() <  pilha2.olha().getTamanho() || !pilha3.vazia() && pilha2.vazia() ) {

                System.out.println("Origem: " + pilha3.olha() + " e " + "Destino: " + pilha2.olha());
                
            } else if(pilha3.olha().getTamanho() <  pilha1.olha().getTamanho() || !pilha3.vazia() && pilha1.vazia()) {
                System.out.println("Origem: " + pilha3.olha() + " e " + "Destino: " + pilha1.olha());
            } else if(pilha2.olha().getTamanho() <  pilha3.olha().getTamanho() || !pilha2.vazia() && pilha3.vazia()) {
                System.out.println("Origem: " + pilha3.olha() + " e " + "Destino: " + pilha2.olha());
            } else if(pilha2.olha().getTamanho() <  pilha1.olha().getTamanho() || !pilha2.vazia() && pilha1.vazia()) {
                System.out.println("Origem: " + pilha2.olha() + " e " + "Destino: " + pilha1.olha());
            } else if(pilha1.olha().getTamanho() <  pilha3.olha().getTamanho() || !pilha1.vazia() && pilha3.vazia()) {
                System.out.println("Origem: " + pilha1.olha() + " e " + "Destino: " + pilha3.olha());
            } else if(pilha1.olha().getTamanho() <  pilha2.olha().getTamanho() || !pilha1.vazia() && pilha2.vazia()) {
                System.out.println("Origem: " + pilha1.olha() + " e " + "Destino: " + pilha2.olha());
            }
        } catch(Exception e) {
            System.out.println("Sem dicas!");
        }
    }
    
    public static boolean movimentoValido(int origem, int destino) 
    {   
        boolean veredito = false;
        try {
            
            Pilha origemAux = lista.get(origem - 1);
            Pilha destinoAux = lista.get(destino - 1);
            if (origemAux.vazia() && destinoAux.vazia()) {
            veredito = false;
            } else if(destinoAux.vazia()) {
                System.out.println("Jogada Permitida");
                veredito = true;
            } else if(origemAux.vazia()) {
                System.out.println("Jogada nao permitida");
                veredito = false;
            } else {
                Disco origemDisc = (Disco) origemAux.olha();
                Disco destinoDisc = (Disco) destinoAux.olha();
                if(origemDisc.getTamanho() <= destinoDisc.getTamanho() || destinoAux.vazia()) {
                    System.out.println("Jogada permitida!");
                    veredito = true;
                } else if(origemDisc.getTamanho() >= destinoDisc.getTamanho()) {
                    System.out.println("Jogada nao permitida!");
                    veredito = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Jogada nao permitida!");
            veredito = false;
        }
        return veredito;
    }
}
