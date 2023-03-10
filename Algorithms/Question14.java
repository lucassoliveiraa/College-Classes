import javax.swing.JOptionPane;

/*2 - Cadastar N produtos (Nome, Preço, Quantidade)
    Possibilitar consulta de produto pelo nome
*/
public class Atividade2 
{
    public static void main(String[] args) 
    {
        int n_vezes = 0, qtd[] = new int[10];
        String prod[] = new String[10];
        float prec[] = new float[10];
        String escolha = "S", consultar;
        String dado;

        while(escolha.equalsIgnoreCase("S") & n_vezes <= 10)
        {
            prod[n_vezes] = JOptionPane.showInputDialog("Produto " + (n_vezes + 1));
            prec[n_vezes] = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));
            qtd[n_vezes] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
            escolha = JOptionPane.showInputDialog("Cadastrar mais dados: (S/N)");
            n_vezes++;
        }
        consultar = JOptionPane.showInputDialog("Deseja consultar algum produto (S/N)");
        if(consultar.equalsIgnoreCase("S"))
        {
            dado = JOptionPane.showInputDialog("Consultar Produto: ");
            if(dado.equals(""))
            {
                while(dado.equals(""))
                {
                    dado = JOptionPane.showInputDialog( "Você não digitou o nome do produto! Tente Novamente" + "\n" + 
                                                        "Consultar Produto: ");
                }
            }

            for(int i = 0; i < prod.length; i++)
            {
                if(dado.equals(prod[i]))
                {
                    JOptionPane.showMessageDialog(null,   "Produto: " + prod[i] + "\n"
                                                        + "Preço: " + prec[i] + "\n"
                                                        + "Quantidade: " + qtd[i]);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por cadastrar seus produtos em nosso servico");
    }  
}

