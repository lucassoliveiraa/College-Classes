import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();

        int fatorial = fat(num);
        
        System.out.println("Fatorial is " + fatorial);

        input.close();
    }

    public static int fat(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fat(n - 1);
    }
}
