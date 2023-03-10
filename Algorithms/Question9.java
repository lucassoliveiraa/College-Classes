import javax.swing.JOptionPane;

public class Questao20{
    public static void main(String[] args) {
        int comp_A, comp_B, comp_C;

        comp_A = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento A: "));
        comp_B = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento B: "));
        comp_C = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento C: "));

        if(comp_A < comp_B + comp_C && comp_B < comp_A + comp_C && comp_C < comp_A + comp_B){
            if(comp_A == comp_B && comp_B == comp_C){
                JOptionPane.showMessageDialog(null,"Triângulo Equilátero");
            }
                else if(comp_A == comp_B || comp_A == comp_C || comp_B == comp_C){
                    JOptionPane.showMessageDialog(null, "Triângulo Isóscele");
                }
                    else{
                        JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
                    }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não é um Triângulo");
        }
    }
}