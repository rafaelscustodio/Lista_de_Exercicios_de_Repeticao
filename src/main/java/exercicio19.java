import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int maiorNum = 0, menorNum = 0, N, vet[], soma = 0;
      System.out.print("Quantos números você quer digitar? ");
      N = sc.nextInt();
      vet = new int[N];
      for(int i = 0; i < N; i++){
        System.out.print("Digite o " + (i+1) + "º número: ");
        vet[i] = sc.nextInt();
        if(vet[i] < 0 || vet[i] > 1000){
          System.out.print("O número deve estar entre 0 e 1000. Digite novamente o " + (i+1) + "º número: ");
          vet[i] = sc.nextInt();
        }
        soma += vet[i];
        maiorNum = vet[i];
        menorNum = vet[i];
      }  
      for(int i = 0; i < N; i++){
        if(vet[i] > maiorNum){
          maiorNum = vet[i];
        }
        else if(vet[i] < menorNum){
          menorNum = vet[i];
        }
      }
      System.out.println("O maior número digitado foi: " + maiorNum);
      System.out.println("O menor número digitado foi: " + menorNum);
      System.out.println("A soma dos números digitados foi: " + soma);
    }
}