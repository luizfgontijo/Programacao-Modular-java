package model;

public class Duracao {
    private int duracaoTotal;

    public Duracao(Hora horaInicial, int duracaoEmSegundos) {
        this.duracaoTotal = duracaoEmSegundos;
    }

    public boolean maiorQue(Duracao outraDuracao) {
        return this.duracaoTotal > outraDuracao.duracaoTotal;
    }

    public int duracaoEmSegundos() {
        return duracaoTotal;
    }

}
