package campeonato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Campeonato {
    private List<Time> times;

    public Campeonato() {
        this.times = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        times.add(time);
    }

    // Ordenar a lista de times do maior número de pontos para o menor
    public void classificarTimes() {
        Collections.sort(times, Comparator.comparingInt(Time::getPontos).reversed());
    }

    public void mostrarResultadoFinal() {
        classificarTimes();

        System.out.println("🏆 RESULTADO FINAL 🏆");
        for (int i = 0; i < times.size(); i++) {
            Time time = times.get(i);
            int posicao = i + 1;

            System.out.print(posicao + "º - " + time.getNome());

            if (posicao <= 3) {
                System.out.println(" 🥇 Medalha");
            } else {
                System.out.println(" ❌ Sem medalha");
            }
        }
    }
}