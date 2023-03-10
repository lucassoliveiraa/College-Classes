import javax.swing.JOptionPane;

public class Questao22 {
    public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        
        if (idade >= 5 && idade <= 7){
            JOptionPane.showMessageDialog(null, "INFANTIL A");
        }
        if (idade >= 8 && idade <= 10){
            JOptionPane.showMessageDialog(null, "INFANTIL B");
        }
        if (idade >= 11 && idade <= 13){
            JOptionPane.showMessageDialog(null, "JUVENIL A");
        }
        if (idade >= 14 && idade <= 17){
            JOptionPane.showMessageDialog(null, "JUVENIL B");
        }
        if (idade >= 18 && idade <= 25){
            JOptionPane.showMessageDialog(null, "SÊNIOR");
        }
        if (idade < 5 && idade > 25){
            JOptionPane.showMessageDialog(null, "IDADE FORA DA FAIXA ETARIA");
        }
    }
}
