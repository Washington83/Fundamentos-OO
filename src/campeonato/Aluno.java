package campeonato;

public class Aluno {
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
