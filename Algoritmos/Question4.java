import java.util.Scanner;

public class Questao4{
    public static void main(String[] args) {
        int numi, numf, ct;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o número inicial: ");
        numi = input.nextInt();
        System.out.println("Qual o número final: ");
        numf = input.nextInt();
        ct = numi + 1;
        if (numi < numf){
            while(ct < numf){
                if (ct % 2 == 0){
                    System.out.print(ct + " ");
                }
                ct++;
            }
        }
        if (numi > numf){
            while(ct > numf){
                if (ct % 2 == 0){
                    System.out.print(ct);
                }
            ct--;
            }
        }
        input.close();
    }
}