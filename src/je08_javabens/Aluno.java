package je08_javabens;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int newIdade) {
        if(newIdade < 0)
            throw new IllegalArgumentException("O valor da idade deve ser superior a 0");
        this.idade = newIdade;
    }

    public int getIdade() {
        return idade;
    }
}
