package je09_controle_fluxo.estruturas_repeticao.for_para;

public class ExemploFor {

    public static void main(String[] args) {
        // for (int carnerinhos = 1; carnerinhos < 10; carnerinhos++) {
        //     System.out.println(carnerinhos + " - Carneirinho(s)");
        // }

        // String alunos []={"Felipe", "Jonas", "Julia", "Marcos"};
        // for (int i = 0; i < alunos.length; i++) {
        //     System.out.println("O aluno no indice i="+ (i+1) +" é " + alunos[i]);
        // }
        // String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};
        // for (String aluno : alunos){
        //     System.out.println(aluno);
        // }
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
            }

            System.out.println(numero);
        }

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue;
            }

            System.out.println(numero);
        }
    }
}
