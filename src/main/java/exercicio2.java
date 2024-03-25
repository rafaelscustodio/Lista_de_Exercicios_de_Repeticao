import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome, senha;
    System.out.print("Digite o nome de usuário: ");
    nome = sc.nextLine();
    System.out.print("Digite a senha: ");
    senha = sc.nextLine();

    while (senha.equals(nome)){
      System.out.println("A senha não pode ser igual ao nome de usuário!");
      System.out.print("Digite a senha: ");
      senha = sc.nextLine();
    }
    System.out.println("Usuário e senha cadastrados com sucesso!");
    sc.close();
  }

}