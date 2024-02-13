//4 - Alterar questão 3 para não deixar vender quantidade maior que o produto tem em estoque

import javax.swing.JOptionPane;


public class Atividade4 
{
    public static void main(String[] args) 
    {
        int n_vezes = 0, qtd[] = new int[10], qtdVend = 0, escolha;
        String prod[] = new String[10];
        float prec[] = new float[10], valTot = 0;
        String consultar;
        String dado;

        escolha = JOptionPane.YES_OPTION;

        while((escolha == JOptionPane.YES_OPTION) & (n_vezes <= 10))
        {
            prod[n_vezes] = JOptionPane.showInputDialog("Produto " + (n_vezes + 1));
            prec[n_vezes] = Float.parseFloat(JOptionPane.showInputDialog("Preço: "));
            qtd[n_vezes] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: "));
            n_vezes++;

            escolha = JOptionPane.showConfirmDialog(null, "Cadastrar mais dados: (S/N)", "Confirmação", JOptionPane.YES_NO_OPTION);
        }
        consultar = JOptionPane.showInputDialog("Deseja consultar algum produto (S/N)");
        if(consultar.equals("S"))
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
                    JOptionPane.showMessageDialog(null, "Produto: " + prod[i] + "\n" +
                                                        "Preço: " + prec[i] + "\n" +
                                                        "Quantidade: " + qtd[i]);

                    qtdVend = Integer.parseInt(JOptionPane.showInputDialog("Quantidade desejada: "));
                    valTot = prec[i] * qtdVend;
                        
                    if (qtd[i] >= qtdVend)
                    {
                        JOptionPane.showMessageDialog(null, "Produto: " + prod[i] + "\n" +
                                                            "Preço: " + prec[i] + "\n" +
                                                            "Quantidade Vendida: " + qtdVend + "\n" +
                                                            "Valor total da venda: " + valTot); 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Quantidade desejada para compra maior que quantidade em estoque!");
                    }
                }
            }
        }  
        JOptionPane.showMessageDialog(null, "Obrigado por usar nosso serviço");
    }
}    

                    