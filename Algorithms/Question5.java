import java.util.Scanner;

public class Questao5{
    public static void main(String[] args) {
        int num, i = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número desejado: ");
        num = input.nextInt();

        while(i < num){
            if ((i % 5 == 0) || (i % 7 == 0)){
                System.out.print(i + " ");
            }
            i++;
        }
        input.close();
    }
}