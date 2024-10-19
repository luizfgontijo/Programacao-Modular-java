package model;

import java.util.List;

public class Ciclista extends Participante {
    private List<Etapa> dadosEtapa;

    public Ciclista(String nome, int numero, String cidadeDeOrigem, List<Etapa> dadosEtapa) {
        super(nome, numero, cidadeDeOrigem);
        this.dadosEtapa = dadosEtapa;
    }

    public List<Etapa> getDadosEtapa() {
        return dadosEtapa;
    }

    public void adicionarEtapa(Etapa etapa) {
        this.dadosEtapa.add(etapa);
    }

    @Override
    public String getNome() {
        return this.nome;
    }
}