import javax.swing.JOptionPane;

public class Questao1{  
    public static void main(String[] args) 
    {
        int cod;
        int qtd;
        double tot = 0;
        String pdt = "";

        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto: "));
        qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
        switch(cod)
        {
            case 1001:
                tot = 5.32 * qtd;
                pdt = "Cano PVC";
                break;
            case 1324:
                tot = 6.45 * qtd;
                pdt = "Rolo de Fio";
                break;
            case 6548:
                tot = 2.37 * qtd;
                pdt = "Fita Isolante";
                break;
            case 987:
                tot = 5.32 * qtd;
                pdt = "Cola";
                break;
            case 7623:
                tot = 6.45 * qtd;
                pdt = "Emendas";
                break;
            default:
                System.out.print("Erro!");
                
        }
        JOptionPane.showMessageDialog(null, "Produto: " + pdt + "\n"
                                      + "Quatidade: " + qtd + "\n"
                                      + "Total: R$ " + tot);
    }
}