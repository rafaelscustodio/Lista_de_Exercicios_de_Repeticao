import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma = 0;
    System.out.print("Quantos números serão digitados para saber a média aritmética? ");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      System.out.print("Digite o " + (i+1) + "º número: ");
      int num = sc.nextInt();
      soma += num;      
    }
    double media = (double) soma / n;
    System.out.println("A média aritmética é: " + String.format("%.1f", media));
    sc.close();
  }
}