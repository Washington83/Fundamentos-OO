package campeonato;

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", 14);
        Aluno a2 = new Aluno("Maria", 13);
        Aluno a3 = new Aluno("Pedro", 15);

        Time timeA = new Time("Time Azul");
        timeA.adicionarAluno(a1);
        timeA.adicionarAluno(a2);
        timeA.adicionarPontos(30);

        Time timeB = new Time("Time Vermelho");
        timeB.adicionarAluno(a3);
        timeB.adicionarPontos(20);

        Time timeC = new Time("Time Verde");
        timeC.adicionarPontos(40);

        Campeonato campeonato = new Campeonato();
        campeonato.adicionarTime(timeA);
        campeonato.adicionarTime(timeB);
        campeonato.adicionarTime(timeC);

        campeonato.mostrarResultadoFinal();
    }
}