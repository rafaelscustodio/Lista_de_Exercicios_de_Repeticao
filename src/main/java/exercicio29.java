
public class Main {
  public static void main(String[] args) {
    double valorProduto = 0;
    System.out.println("Lojas Quase Dois - Tabela de preços");
    for(int i = 1; i <= 50; i++){
      valorProduto += 1.99;
      System.out.println(i + " - R$ " + String.format("%.2f", valorProduto));
    }
  }

}