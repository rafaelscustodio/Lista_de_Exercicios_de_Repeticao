import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int numMinCaracter = 3;
    System.out.print("Digite seu nome com no minimo " + numMinCaracter + " caracteres: ");
    String nome = sc.nextLine();
    while (nome.length() < numMinCaracter) {
      System.out.print("Digite seu nome com no minimo " + numMinCaracter + " caracteres: ");
      nome = sc.nextLine();
    }
    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt();
    while (idade < 0 || idade > 150) {
      System.out.print("Digite sua idade: ");
      idade = sc.nextInt();
    }
    System.out.print("Digite seu salário: ");
    double salario = sc.nextDouble();
    while (salario < 0) {
      System.out.print("Digite seu salário: ");
      salario = sc.nextDouble();
    }
    System.out.print("Digite seu sexo (F/M): ");
    char sexo = sc.next().charAt(0);
    while (sexo != 'F' && sexo != 'M'){
      System.out.print("Digite seu sexo (F/M): ");
      sexo = sc.next().charAt(0);
    }
    System.out.print("Digite seu estado civil (S/C/V/D): ");
    char estadoCivil = sc.next().charAt(0);
    while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
      System.out.print("Digite seu estado civil (S/C/V/D): ");
      estadoCivil = sc.next().charAt(0);
    }
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salário: " + String.format("R$ %.2f", salario));
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado civil: " + estadoCivil);
    sc.close();
  }

}