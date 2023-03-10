import javax.swing.JOptionPane;

public class Questao9{
    public static void main(String[] args) {
        int num_um = 0, num_dois = 0;
        float result = 0;
        char opr = ' ';

        while(opr != 's') {
            num_um = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            opr = JOptionPane.showInputDialog("Operação: ").charAt(0);
            num_dois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
            
            if (opr == '+') {
                result = num_um + num_dois;
                JOptionPane.showMessageDialog(null, result);
            }
            if(opr == '-'){
                result = num_um - num_dois;
                JOptionPane.showMessageDialog(null, result);
            }
            if(opr == '*'){
                result = num_um * num_dois;
                JOptionPane.showMessageDialog(null, result);
            }
            if(opr == '/'){
                if (num_dois != 0){
                    result = num_um / num_dois;
                    JOptionPane.showMessageDialog(null, result);
                }
                    else{
                        JOptionPane.showMessageDialog(null, "INDETERMINAÇÃO| DIVISÃO POR 0");
                    }
            }
            if ((opr != '+') & (opr != '-') & (opr != '*') & (opr != '/')){
                JOptionPane.showMessageDialog(null, "Operação invalida");
            }
        }
        System.out.println(result);
    }
}