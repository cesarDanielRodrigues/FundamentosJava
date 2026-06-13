package je09_controle_fluxo.exceptions.cenario_conhecido;

import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite seu nome:");
      String nome = scanner.next();

      System.out.println("Digite sua idade:");
      Integer idade = scanner.nextInt();

      System.out.println(nome);
      System.out.println(idade);
    }
}
