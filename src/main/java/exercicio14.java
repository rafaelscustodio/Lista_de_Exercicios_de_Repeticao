import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numPar = 0, numImpar = 0;
    for (int i = 1; i <= 10; i++){
      System.out.print("Digite o " + i + "º número: ");
      int num = sc.nextInt();
      if (num % 2 == 0){
        numPar += 1;        
      } 
      else {        
        numImpar += 1; 
      }
    }
    System.out.println("\nA quantidade de números pares é: " + numPar);
    System.out.println("\nA quantidade de números ímpares é: " + numImpar);
    sc.close();
  }

}