import java.util.Scanner;

public class Potencia{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int base;
    int exp;

    base = input.nextInt();
    exp = input.nextInt();

    System.out.println(pot(base,exp));
    input.close();
  }
  public static int pot(int base, int exp){
    if(exp == 0)
      return 1;
    else
      return (base * pot(base, exp-1));
  }
}