import javax.swing.JOptionPane;

public class Questao2{
    public static void main(String[] args) {
        double salold, dif, salNov;
        int cod;

        salold = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
        cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código: "));

        switch (cod) {
            case 1001:
                salNov = (salold * 1.15);
                dif = salNov - salold;
                break;
            case 1002:
                salNov = (salold * 1.20);
                dif = salNov - salold;
                break;
            case 1003:
                salNov = (salold * 1.25);
                dif = salNov - salold;
                break;
            default:
                salNov = (salold * 1.40);
                dif = salNov - salold;
                break;
        }
        JOptionPane.showMessageDialog(null,"Antigo Salário: "+ salold + "\n"
                                      +"Novo Salário: " + salNov + "\n"
                                      +"Diferença: " + dif);
    }
}