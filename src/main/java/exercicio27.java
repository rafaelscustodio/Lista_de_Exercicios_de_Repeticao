import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Qual a quantidade de turmas: ");
    int turmas = sc.nextInt();
    int totalAlunos = 0;
    for (int i = 1; i <= turmas; i++){
      System.out.print("Qual a quantidade de alunos na turma " + i + ": ");
      int alunos = sc.nextInt();
      totalAlunos += alunos;
      while(alunos > 40){
        System.out.print("A turma não pode ter mais de 40 alunos. Digite novamente: ");
        alunos = sc.nextInt();
      }      
    }
    int media = totalAlunos / turmas;
    System.out.print("\nA média de alunos por turma é: " + media);
    sc.close();
  }
}