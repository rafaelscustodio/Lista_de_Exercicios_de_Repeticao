import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma = 0;
    System.out.print("Quantas idades serão digitadas?");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      System.out.print("Digite a " + (i+1) + "ª idade: ");
      int idade = sc.nextInt();
      soma += idade;
    }
    int media = soma/n;
    if (media >= 0 && media <= 25){
      System.out.println("\nA turma é jovem!");    
    }
    else if (media >= 26 && media <= 60){
      System.out.println("\nA turma é adulta!");
    }
    else {
      System.out.println("\nA turma é idosa!");
    }
  }

}