import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int soma = 0;
    for (int i = 1; i < 6; i++){
      System.out.print("Digite o " + i + "º número: ");
      int num = sc.nextInt();
      soma += num;
    }
    int media = soma / 5;
    System.out.println();
    System.out.println("A média dos números digitados é: " + media);
    sc.close();
  }

}