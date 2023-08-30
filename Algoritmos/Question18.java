import javax.swing.JOptionPane;

public class CompraArray {
    public static void main(String[] args) {
        float val[] = new float[5], tot;

        tot = 0;
        for (int i = 0; i < 5; i++)
        {
            val[i] = Float.parseFloat(JOptionPane.showInputDialog("Valor do produto: " + (i + 1)));  
            tot += val[i];
        }
        JOptionPane.showMessageDialog(null, "O valor total é: " + tot);
    }
}
