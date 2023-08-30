/*3 - Alterar a questão 2 para, localizar o produto pelo nome
    Pedir para digitar a quantidade a ser vendida e mostar o total da venda no formato:
    - Nome Produto
    - Preço Produto
    - Quantidade vendida
    - Valor total da venda
*/
import javax.swing.JOptionPane;

public class Atividade3 
{
    public static void main(String[] args) 
    {
        int n_vezes = 0, qtd[] = new int[10], qtdVend = 0;
        String prod[] = new String[10];
        float prec[] = new float[10], valTot = 0;
        String escolha = "S", consultar;
        String dado;

        while(escolha.equals("S") & n_vezes <= 10)
        {
            prod[n_vezes] = JOptionPane.showInputDialog("Produto " + (n_vezes + 1));
            prec[n_vezes] = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));
            qtd[n_vezes] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
            escolha = JOptionPane.showInputDialog("Cadastrar mais dados: (S/N)");
            n_vezes++;
        }
        consultar = JOptionPane.showInputDialog("Deseja consultar algum produto (S/N)");
        if(consultar.equals("S"))
        {
            dado = JOptionPane.showInputDialog("Consultar Produto: ");
            if(dado != null)
            {
                for(int i = 0; i < prod.length; i++)
                {
                    if(dado.equals(prod[i]))
                    {
                        JOptionPane.showMessageDialog(null, "Produto: " + prod[i] + "\n"
                                                          + "Preço: " + prec[i] + "\n"
                                                          + "Quantidade: " + qtd[i]);
                        qtdVend = Integer.parseInt(JOptionPane.showInputDialog("Quantidade desejada: "));
                        valTot = prec[i] * qtdVend;
                        JOptionPane.showMessageDialog(null, "Produto: " + prod[i] + "\n"
                                                          + "Preço: " + prec[i] + "\n"
                                                          + "Quantidade Vendida: " + qtdVend + "\n" 
                                                          + "Valor total da venda: " + valTot);
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por cadastrar seus produtos em nosso servico");   
    }
}
