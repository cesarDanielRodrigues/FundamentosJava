package je10_orientacao_a_objetos;

public class Sistema {

    public static void main(String[] args) {
        Cliente cesar = new Cliente("César");
        System.out.println("Limite de credito da " + cesar.nome + " é " + cesar.limiteCredito);
        cesar.solicitarLimiteCredito(200.0);
        cesar.comprar(80.0);
        System.out.println("Limite de credito da " + cesar.nome + " é " + cesar.limiteCredito);


        Cliente manuela = new Cliente("Manuela");
        System.out.println("Limite de credito da " + manuela.nome + " é " + manuela.limiteCredito);
        manuela.solicitarLimiteCredito(300.0);
        System.out.println("Limite de credito da " + manuela.nome + " é " + manuela.limiteCredito);

    }
}
