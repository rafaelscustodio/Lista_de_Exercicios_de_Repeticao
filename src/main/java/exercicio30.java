import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valorProduto = 0;
    System.out.print("Preço do pão: R$");
    double precoPao = sc.nextDouble();
    System.out.println("Panificadora Pão de Ontem - Tabela de preços");
    for(int i = 1; i <= 50; i++){
      valorProduto += precoPao;
      System.out.println(i + " - R$ " + String.format("%.2f", valorProduto));
    }
    sc.close();
  }

}