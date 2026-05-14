package je08_javabens;

public class Objetos {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setIdade(-1);
        felipe.setNome("Manuel");
        System.out.println(felipe.getIdade());
        System.out.println(felipe.getNome());

    }
}
