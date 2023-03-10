import java.util.Scanner;

class soma{
    public static void main(String[] args) {
        int num = 0, tot = 0;
        Scanner input = new Scanner(System.in);

        while(num >= 0){
            System.out.println("Digite um número:");
            num = input.nextInt();
            tot += num;
        }
        System.out.println("A soma de todos os números digitados é: " + tot );
        input.close();
    }
}