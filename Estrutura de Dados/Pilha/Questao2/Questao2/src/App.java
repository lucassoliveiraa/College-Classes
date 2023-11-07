import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String msg, msgCript = "";
        char atual;
        Stack<Character> pilhaAtual = new Stack<Character>();

        msg = JOptionPane.showInputDialog("Digite a mensagem");
        LinkedList<Stack<Character>> lista = new LinkedList<Stack <Character>>();

        //Percorrer a mensagem
        for(int i = 0; i < msg.length(); i++)
        {
            atual = msg.charAt(i);
            if (atual != ' ') {
                pilhaAtual.push(atual);
            } else { //Chegou no espaço, completou a palavra
                lista.add(pilhaAtual);
                System.out.println(pilhaAtual);
                pilhaAtual = new Stack<Character>();
                
            }
        }
        lista.add(pilhaAtual);//Add a ultima palavra da lista
        System.out.println(pilhaAtual);
        
        //Percorrer a lista e as pilhas
        for (int i = 0; i < lista.size(); i++) 
        {
            pilhaAtual = lista.get(i);
            //Percorrer a pilha
            while(!pilhaAtual.empty()) 
            {
                msgCript += pilhaAtual.pop();
            }
            msgCript += ' ';
        }
        System.out.println(msgCript);
    }
}
