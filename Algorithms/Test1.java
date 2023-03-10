import javax.swing.JOptionPane;

/*
  Nome: Lucas Silva de Oliveira
  Data:27/10/2021
*/
public class Avaliacao 
{
  public static void main(String[] args) 
  {
    int cont = 0, escolha, opc,consul; 
    String cod[] = new String[100], consul_B;
    String nome[] = new String[100];
    String bairro[] = new String[100];
    float valor[] = new float[100], consul_V;

    escolha = JOptionPane.YES_OPTION;

    //Esse while cadastra os imóveis
    while((escolha == JOptionPane.YES_OPTION) & (cont <= 100))
    {
      cod[cont] = JOptionPane.showInputDialog("Código " );
      nome[cont] = JOptionPane.showInputDialog("Nome do Proprietário: ");
      bairro[cont] = JOptionPane.showInputDialog("Bairro: ");
      valor[cont] = Float.parseFloat(JOptionPane.showInputDialog("Valor: "));

      escolha = JOptionPane.showConfirmDialog(null, "Cadastrar mais imóveis: ", "Confirmação", JOptionPane.YES_NO_OPTION);
      cont++;
    }

    //Mostra o total de imóveis cadastrados utilizando o contador
    JOptionPane.showMessageDialog(null, "Foram cadastrados " + cont + " imóveis no nosso banco de dados!" );

    opc = JOptionPane.showConfirmDialog(null, "Deseja consultar:", "Confirmação", JOptionPane.YES_NO_OPTION);
    //O usuário pode consultar os imóveis o tanto que ele desejar
    while(opc == JOptionPane.YES_OPTION)
    {
      //Ele escolhe o tipo de consulta e também pode encerrar o programa
      consul = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES " + "\n" +
                                                            "1 - Consulta pelo Valor " + "\n" +
                                                            "2 - Consulta pelo Bairro" + "\n" +
                                                            "Números Diferentes de 1 e 2 - Sair"));

      if(consul == 1)
      {
        consul_V = Float.parseFloat(JOptionPane.showInputDialog("Valor máximo desejado: "));

        for(int i = 0; i < valor.length; i++)
        {
          if(valor[i] <= consul_V & valor[i] > 0)
          {
            JOptionPane.showMessageDialog(null, "Código: " + cod[i] + "\n" +
                                                "Nome do proprietário: " + nome[i] + "\n" +
                                                "Bairro: " + bairro[i] + "\n" +
                                                "Valor: " + valor[i]);
          }
        }
      }
      if(consul == 2)
      { 
        consul_B = JOptionPane.showInputDialog("Bairro desejado");

        for(int j = 0; j < bairro.length; j++)
        {
          if(consul_B.equalsIgnoreCase(bairro[j]) & bairro[j] != null)
          {
            JOptionPane.showMessageDialog(null, "Código: " + cod[j] + "\n" +
                                                "Nome do proprietário: " + nome[j] + "\n" +
                                                "Bairro: " + bairro[j] + "\n" +
                                                "Valor: " + valor[j]);
          }   
        }
      }
      if(consul != 1 & consul != 2)
      {
        break;
      }
    }
    JOptionPane.showMessageDialog(null, "OBRIGADO POR UTILIZAR NOSSO SERVIÇO!");
  }
}