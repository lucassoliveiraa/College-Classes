import javax.swing.JOptionPane;

public class Questao21 {
    public static void main(String[] args) {
        int nvl, hora;
        float sal_Hora = 0, sal = 0;

        nvl = Integer.parseInt(JOptionPane.showInputDialog("Digite o nível do professor: "));
        hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora/aula do professor: "));

        switch(nvl){
            case 1:
                sal_Hora = 12;
                sal = hora * sal_Hora;
                JOptionPane.showMessageDialog(null, "O Salário do professor é: " + sal);
                break;
            case 2:
                sal_Hora = 17;
                sal = hora * sal_Hora;
                JOptionPane.showMessageDialog(null, "O Salário do professor é: " + sal);
                break;
            case 3:
                sal_Hora = 25;
                sal = hora * sal_Hora;
                JOptionPane.showMessageDialog(null, "O Salário do professor é: " + sal);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nível digitado ínvalido!");
                break;
        }
    }
}
