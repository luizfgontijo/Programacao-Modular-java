package controller;

import view.CiclistaView;

public class CiclistaController {
    private CiclistaView view;
    private String liderCorrida;
    private int menorTempoGeral = Integer.MAX_VALUE;

    public CiclistaController(CiclistaView view) {
        if (view == null) {
            throw new IllegalArgumentException("View não pode ser null");
        }

        this.view = view;
    }

    public void iniciar() {
        view.iniciar();
    }

    public void adicionarEtapaParaCiclistas() {
        try {
            int numeroEtapa = view.getNumeroEtapa();
            String nomeCiclista1 = view.getNomeCiclista1();
            int duracaoCiclista1 = view.getDuracaoCiclista1();

            String nomeCiclista2 = view.getNomeCiclista2();
            int duracaoCiclista2 = view.getDuracaoCiclista2();

            String vencedorEtapa = "";
            if (duracaoCiclista1>duracaoCiclista2){
                 vencedorEtapa= nomeCiclista2;
            } else if (duracaoCiclista2>duracaoCiclista1){
                 vencedorEtapa= nomeCiclista1;
            } else{
                 vencedorEtapa = "Empate";
            }
            view.mostrarResultado("Vencedor da Etapa " + numeroEtapa + ": " + vencedorEtapa);

            int diferencaTempo=0;

            if (duracaoCiclista1> duracaoCiclista2){
                diferencaTempo= duracaoCiclista1- duracaoCiclista2;
            } else if (duracaoCiclista1<duracaoCiclista2) {
                diferencaTempo = duracaoCiclista2- duracaoCiclista1;
            } else {
                diferencaTempo = 0;
            }

            view.mostrarResultado("Diferença de tempo entre os dois ciclistas: "+ + diferencaTempo + " segundos.");
            if (duracaoCiclista1 < menorTempoGeral) {
                menorTempoGeral = duracaoCiclista1;
                liderCorrida = nomeCiclista1;
            } else if (duracaoCiclista2 < menorTempoGeral) {
                menorTempoGeral = duracaoCiclista2;
                liderCorrida = nomeCiclista2;
            }

            view.mostrarResultado("Líder Geral: " + liderCorrida);

        } catch (Exception e) {
            view.mostrarResultado("Erro ao adicionar etapa: " + e.getMessage());
        }
    }
}
