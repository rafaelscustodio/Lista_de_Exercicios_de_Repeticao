import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Digite um número de 0 a 10: ");
      int num = sc.nextInt();
      for(int i = 1; i <= 10; i++){
        System.out.println(num + " x " + i + " = " + (num * i));
      }
      sc.close();
  }

}