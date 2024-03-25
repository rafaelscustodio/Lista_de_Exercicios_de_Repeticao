import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int candidato1 = 0, candidato2 = 0, candidato3 = 0;
    System.out.print("Qual o número total de eleitores? ");
    int eleitores = sc.nextInt();
    for (int i = 0; i < eleitores; i++){
      System.out.print("Qual o seu voto? Candidato 1, 2 ou 3? ");
      int voto = sc.nextInt();
      if (voto == 1){
        candidato1++;
      } else if (voto == 2){
        candidato2++;
      } else if (voto == 3){
        candidato3++;
      }      
    }
    System.out.println("Candidato 1 recebeu: " + candidato1 + " votos!");
    System.out.println("Candidato 2 recebeu: " + candidato2 + " votos!");
    System.out.println("Candidato 3 recebeu: " + candidato3 + " votos!");
    sc.close();
  }

}