import javax.swing.JOptionPane;

public class Array
{
    public static void main(String[] args) {
        float a,b,c;
        
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite a: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite b: "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite c: "));

        JOptionPane.showMessageDialog(null, delta(a,b,c));
    }
    public static float delta(Float a,Float b, Float c)
    {
        float delt;
        delt = b*b - 4 * a * c;

        return delt;
    }
}


