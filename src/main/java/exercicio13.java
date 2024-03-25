import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um número para ser a base: ");
    int numBase = sc.nextInt();
    System.out.print("Digite um número para ser o expoente: "); 
    int numExp = sc.nextInt();
    int res = 1;
    for(int i = 0; i < numExp; i++){
      res *= numBase ;      
    } 
    System.out.print("O resultado é: " + res);
    sc.close();
  }

}