import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {  
    int nota;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite uma nota entre zero e dez: ");
    nota = teclado.nextInt();
    while (nota < 0 || nota > 10){
      System.out.print("Nota inválida. Digite uma nota entre zero e dez: ");
      nota = teclado.nextInt();
    }
    System.out.println("Nota válida: " + nota);
    teclado.close();       
  }
}