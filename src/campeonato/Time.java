package campeonato;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Aluno> alunos;
    private int pontos;

    public Time(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }
}
