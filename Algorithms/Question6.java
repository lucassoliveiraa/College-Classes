import java.util.Scanner;

class NumPareImpar{
    public static void main(String[] args) {
        int num1, num2, aux;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        for(int i = num1 + 1; i < num2; i++){

            if(i % 2 == 0){
                System.out.println(i + " é Par! ");
            }
                else{
                    System.out.println(i + " é Impar! ");
                }
        }
        input.close();
    }
}