import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resp;
      do{
        int num;
          do { 
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
          num = sc.nextInt(); 
          if(num < 0 || num > 15){
            System.out.println("Número inválido.");
          }
      }  while(num < 0 || num > 15);        
            int fat = 1;
            for (int i = 1; i <= num; i++) {
              fat *= i;      
          }    
          System.out.print("O fatorial de " + num + " é: " + fat);
          System.out.println("\nDeseja repetir (S/N): ");
          resp = sc.next();
        }
          while(resp.equals("S"));

        System.out.print("Fim do programa");
        sc.close();
  }

}