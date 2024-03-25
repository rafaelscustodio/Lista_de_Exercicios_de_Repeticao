import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o número de habitantes no país A: ");
    int habitantesA = sc.nextInt();
    System.out.print("Digite a taxa de crescimento anual do país A: ");
    int taxaCrescimentoA = sc.nextInt();
    System.out.print("Digite o número de habitantes no país B: ");
    int habitantesB = sc.nextInt();
    System.out.print("Digite a taxa de crescimento anual do país B: ");
    int taxaCrescimentoB = sc.nextInt();
    int anos = 0;
    if (habitantesA < habitantesB){
      while(habitantesA < habitantesB){
        habitantesA += (habitantesA * taxaCrescimentoA) / 100;
        habitantesB += (habitantesB * taxaCrescimentoB) / 100;
        anos = anos + 1;
      }
      System.out.println("Serão necessários " + anos + " anos para que o número de habitantes do país A ultrapasse ou iguale o número de habitantes do país B.");
    }
    else {
      while(habitantesA > habitantesB){
        habitantesA += (habitantesA * taxaCrescimentoA) / 100;
        habitantesB += (habitantesB * taxaCrescimentoB) / 100;
        anos = anos + 1;
      }
      System.out.println("Serão necessários " + anos + " anos para que o número de habitantes do país B ultrapasse ou iguale o número de habitantes do país A.");        
    }
    sc.close();  
  }    

}