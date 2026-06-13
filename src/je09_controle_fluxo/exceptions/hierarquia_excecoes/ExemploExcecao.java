package je09_controle_fluxo.exceptions.hierarquia_excecoes;

public class ExemploExcecao {

    public static void main(String[] args) {

        try {
            Double valor = Double.valueOf("1.75");

            // valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (NumberFormatException ex) {
            System.err.println("Número Invalido");
        }

    }
}
