package je09_controle_fluxo.condicional_ternaria;

public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 3;

    // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
    System.out.println(resultado);

  }
}
