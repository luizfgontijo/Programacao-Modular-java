/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Etapa {
    private int numero;
    private Data data;
    private Hora horaInicial;
    private Duracao duracaoTotal;

    public Etapa(int numero, Data data, Hora horaInicial, Duracao duracaoTotal) {
        this.numero = numero;
        this.data = data;
        this.horaInicial = horaInicial;
        this.duracaoTotal = duracaoTotal;
    }

    public Duracao getDuracaoTotal() {
        return duracaoTotal;
    }
}

