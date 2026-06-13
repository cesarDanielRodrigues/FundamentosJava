package je09_controle_fluxo.switch_case.plano_operadora;

public class PlanoOperadora {

    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5gb Youtube");
                break;
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
        }
    }
}
