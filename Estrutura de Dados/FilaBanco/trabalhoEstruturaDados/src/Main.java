import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        LinkedList<Palavra> lista = new LinkedList<Palavra>();

        SalvaArquivo salva = new SalvaArquivo();
        LinkedList<Palavra> gravAnterior = (LinkedList<Palavra>) salva.ler();

        //Adiciona na lista os elementos já inseridos no arquivo posteriormente
        for(int i = 0; i < gravAnterior.size(); i++) {
            lista.add(gravAnterior.get(i));
        }
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Opcoes\n" +
                                                                "1 - Incluir palavra\n" +
                                                                "2 - Deletar palavra\n" +
                                                                "3 - Mostrar lista de palavras\n" +
                                                                "4 - Inserir lista de palavras em FILA\n" +
                                                                "5 - Criar pilhas com palavras que iniciam com a mesma letra\n" +
                                                                "6 - Inserir lista de palavras em arvore\n" +
                                                                "7 - Salvar lista\n" +
                                                                "8 - Criar indice invertido\n" +
                                                                "9 - Sair"));
            switch (opc) {
                case 1:
                    Palavra pal = new Palavra(JOptionPane.showInputDialog("Digite a palavra"));
                    lista.add(pal);
                    break;
                case 2:
                    String p = JOptionPane.showInputDialog("Digite a palavra que quer remover");
                    Palavra de = new Palavra(p);
                    lista.removeLastOccurrence(de);
                    break;
                case 3:
                    System.out.println(lista);
                    break;
                case 4:
                    Queue<Palavra> fila = insercaoFIla(lista);
                    System.out.println(fila);
                    break;
                case 5:
                    LinkedList<Stack<Palavra>> listaPilhas = insercaoPilha(lista);
                    System.out.println(listaPilhas);
                    break;
                case 6:
                    Arvore<Palavra> listaArvore = new Arvore<Palavra>();
                    for(int i = 0; i < lista.size(); i++)
                    {
                        listaArvore.adicionar(lista.get(i));
                    }
                    System.out.println("Em Ordem: " + listaArvore.emOrdem(listaArvore.getRaiz()));
                    System.out.println("Pre ordem: " + listaArvore.preOrdem(listaArvore.getRaiz()));
                    System.out.println("Palavras Repetidas: " + listaArvore.exibirRepet());
                    break;


                case 7:
                    salva.grava(lista);
                    break;
                case 8:
                    LerTxt ler = new LerTxt();
                    ArrayList<String> oc = new ArrayList<String>();
                    try {
                        oc = ler.ocorrencia(ler.elementosIguais(ler.organizarPilha(ler.pegaTxt())));
                        System.out.println(oc);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        }while(opc != 9);
    }
    //Insere a lista em uma filha em ordem crescente
    public static Queue<Palavra> insercaoFIla(LinkedList<Palavra> li) {
        LinkedList<Palavra> l2 = new LinkedList<Palavra>();

        for (int i = 0; i < li.size(); i++) {
            Palavra palavraInserir = li.get(i);
            boolean inseriu = false;

            int j = 0;
            while (j < l2.size()) {
                Palavra atual = l2.get(j);
                if(palavraInserir.getTamanho() < atual.getTamanho()) {
                    l2.add(j, palavraInserir);
                    inseriu = true;
                    break;
                }
                j++;
            }
            if (!inseriu) {
                l2.addLast(palavraInserir);
            }
        }
        Queue<Palavra> fila = new LinkedList<Palavra>();
        while(!l2.isEmpty()) {
            fila.add(l2.removeFirst());
        }
        return fila;
    }
    //Adiciono a lista em pilhas de palavras que comecem com a msm letra
    public static LinkedList<Stack<Palavra>> insercaoPilha(LinkedList<Palavra> li) {

        LinkedList<Stack<Palavra>> listaPilha = new LinkedList<Stack<Palavra>>();
        Palavra palavraAtual;
        Stack<Palavra> pilhaAtual;

        for(int i = 0; i < li.size(); i++) {
            palavraAtual = li.get(i);
            boolean inseriu = false;
            for (int j = 0; j < listaPilha.size(); j++) {
                pilhaAtual = listaPilha.get(j);

                Palavra topoPalavra = pilhaAtual.peek();

                if(topoPalavra.comparaLetra(palavraAtual)) {
                    pilhaAtual.add(palavraAtual);
                    inseriu = true;
                    break;
                }
            }
            if(!inseriu) {
                Stack<Palavra> novo = new Stack<Palavra>();
                novo.add(palavraAtual);
                listaPilha.add(novo);
            }
        }
        return listaPilha;
    }
}