//Entrada de n alunos; identificar a maior nota das notas digitadas 
import javax.swing.JOptionPane;

public class Exerc {
    public static void main(String[] args) {
        int quant = 0, indexM = 0, indexMe = 0;
        float nt[] = new float[10], maior = 0, menor = 0;
        String nome[] = new String[10];
        String escolha = "S";

        while(escolha.equals("S") & quant <= 10)
        {
            nome[quant] = JOptionPane.showInputDialog("Nome: ");
            nt[quant] = Float.parseFloat(JOptionPane.showInputDialog("Nota " + (quant + 1)));
            maior = nt[0];
            menor = nt[0];
            quant ++;
            escolha = JOptionPane.showInputDialog("Digite mais dados: (S/N)");

            for(int j = 1; j < quant; j++)
            {
                if(nt[j] > maior)
                {
                    maior = nt[j];
                    indexM = j;
                }
                if(nt[j] < menor)
                {
                    menor = nt[j];
                    indexMe = j;
                }       
            }
        }   
        JOptionPane.showMessageDialog(null, "Nome: " + nome[indexM]+ "\n" +
                                            "Maior nota: " + maior + "\n" +
                                            "Index: : " + indexM);
                                    
        JOptionPane.showMessageDialog(null, "Nome: " + nome[indexMe] + "\n" +
                                            "Menor nota: " + menor + "\n" +
                                            "Index: " + indexMe);
    }
}
