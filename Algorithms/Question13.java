import javax.swing.JOptionPane;

public class Atividade1 
{
    public static void main(String[] args) 
    {
        int quant = 0;
        float nt[] = new float[10];
        String nome[] = new String[10], mat[] = new String[10];
        String escolha = "S";

        while(escolha.equals("S") & quant <= 10)
        {
            nome[quant] = JOptionPane.showInputDialog("Nome " + (quant + 1));
            mat[quant] = JOptionPane.showInputDialog("Matrícula " + (quant + 1));
            nt[quant] = Float.parseFloat(JOptionPane.showInputDialog("Nota" + (quant + 1)));
            escolha = JOptionPane.showInputDialog("Digite mais dados: (S/N)");
            quant++;
        }
        for(int i = 0; i < quant; i++)
        {
            if(nt[i] < 7)
                JOptionPane.showMessageDialog(null, "Nome: " + nome[i] + "\n"
                                                  + "Matrícula: " + mat[i] + "\n"
                                                  + "Nota: " + nt[i]);
        }
    }
}
