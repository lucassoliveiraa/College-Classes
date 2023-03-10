import javax.swing.JOptionPane;

public class Questao23 {
    public static void main(String[] args) {
        int tipo, hora;
        float val_Preco = 0, val_Conta;

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo: "));
        hora = Integer.parseInt(JOptionPane.showInputDialog("Digite o consumo: "));

        switch(tipo){
            case 1:
                val_Preco = 0.6f;  
                val_Conta = hora * val_Preco;
                JOptionPane.showMessageDialog(null, "Valor da conta: " + val_Conta);
            break;

            case 2:
                val_Preco = 0.48f;
                val_Conta = hora * val_Preco;
                JOptionPane.showMessageDialog(null, "Valor da conta: " + val_Conta);
            break;

            case 3:
                val_Preco = 1.29f;
                val_Conta = hora * val_Preco;
                JOptionPane.showMessageDialog(null, "Valor da conta: " + val_Conta);
            break;

            default:
                JOptionPane.showMessageDialog(null, "TIPO INVÁLIDO");
            break;
        }
    }
}
