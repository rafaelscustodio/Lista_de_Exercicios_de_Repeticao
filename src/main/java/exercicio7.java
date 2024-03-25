import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int maiorNum = 0;
    for (int i = 1; i < 6; i++){
      System.out.print("Digite o " + i + "º número: ");
      int num = sc.nextInt();
      if(num > maiorNum){
        maiorNum = num;
      }     
    }
    System.out.println();
    System.out.println("O maior número é: " + maiorNum);
    sc.close();
  }

}