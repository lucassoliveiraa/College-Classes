import javax.swing.JOptionPane;

public class Questao3{
    public static void main(String[] args) {

        double ind;
        String opp = "Indústria de Carvão está intimada a parar suas atividades!";
        String ops = "Refinaria de Petróleo também está intimada a parar suas atividades!";
        String opt = "Indústria de Plásticos também está intimada a parar suas atividades!";

        ind = Float.parseFloat(JOptionPane.showInputDialog("Digite indice de poluição: "));
        
        if (ind >= 0.05 && ind <= 0.25){
            JOptionPane.showMessageDialog(null,"Poluição Aceitável!");
        }
        if (ind >= 0.3 && ind < 0.4){
            JOptionPane.showMessageDialog(null, "ALERTA 1: " + opp);
        }
        if (ind >= 0.4 && ind <= 0.5){
            JOptionPane.showMessageDialog(null, "ALERTA 1: " + opp + "\n"
                                          + "ALERTA 2: "+ ops);
        }
        if (ind > 0.5){
            JOptionPane.showMessageDialog(null, "ALERTA 1: " + opp + "\n"
                                          + "ALERTA 2: " + ops + "\n"
                                          + "ALERTA 3: " + opt + "\n");
        }
    }
}