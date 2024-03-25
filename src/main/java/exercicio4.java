
public class Main {
  public static void main(String[] args) {

    int populacaoA = 80000, populacaoB = 200000;
    double taxaA = 0.03, taxaB = 0.015;
    int anos = 0;
    while (populacaoA < populacaoB){
      populacaoA += populacaoA * taxaA;
      populacaoB += populacaoB * taxaB;
      anos = anos + 1;
    }
    System.out.println("A população do país A igualará ou ultrapassará a população do país B em " + anos + " anos.");

  }    

}