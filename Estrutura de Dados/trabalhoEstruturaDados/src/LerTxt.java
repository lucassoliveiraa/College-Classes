
import java.io.*;
import java.nio.file.StandardWatchEventKinds;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LerTxt {

    public String pegaTxt() throws FileNotFoundException {

        File path = new File("src/texto/textoLer.txt");
        Scanner scan = new Scanner(path);

        String palavras = "";
        while(scan.hasNextLine()) {
            palavras = palavras + scan.nextLine();
        }
        scan.close();
        return palavras;
    }
    public LinkedList<Stack<Palavra>> organizarPilha(String p) {
        LinkedList<Stack<Palavra>> lista = new LinkedList<Stack<Palavra>>();
        char charAtual;
        Stack<Palavra> pilha = new Stack<Palavra>();
        String st = "";
        Palavra palavra;

        for (int i = 0; i < p.length(); i++) {

            charAtual = p.charAt(i);

            if (charAtual != ' ' && charAtual != ',' && charAtual != '.') {

                st = st + charAtual;
            } else {
                if (st != "") {
                    palavra = new Palavra(st);
                    pilha.push(palavra);
                    lista.add(pilha);
                    pilha = new Stack<Palavra>();
                    st = "";
                }
            }
        }
        palavra = new Palavra(st);
        pilha.push(palavra);
        lista.add(pilha);

        return lista;
    }
    public LinkedList<Stack<Palavra>> elementosIguais(LinkedList<Stack<Palavra>> li) {
        LinkedList<Stack<Palavra>> listaPilha = new LinkedList<Stack<Palavra>>();
        Palavra palavraAtual;
        Stack<Palavra> pilhaAtual;

        for(int i = 0; i < li.size(); i++) {

            pilhaAtual = li.get(i);
            palavraAtual = pilhaAtual.peek();
            boolean inseriu = false;
            for (int j = 0; j < listaPilha.size(); j++) {
                pilhaAtual = listaPilha.get(j);

                Palavra topoPalavra = pilhaAtual.peek();
                if(palavraAtual.getPalavra().equalsIgnoreCase(topoPalavra.getPalavra())) {
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
    public ArrayList<Stack> ocorrencia(LinkedList<Stack<Palavra>> li) {
        ArrayList<Stack> lista = new ArrayList<Stack>();

        Palavra palavraAtual;
        Stack<Palavra> pilhaAtual;
        for (int i = 0; i < li.size(); i++) {
            Stack<String> novo = new Stack<String>();
            pilhaAtual = li.get(i);
            palavraAtual = pilhaAtual.peek();
            novo.add(palavraAtual.getPalavra() + " - " + pilhaAtual.size());
            lista.add(novo);
        }
        return lista;
    }
}
