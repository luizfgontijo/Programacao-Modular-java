/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Participante {
    protected String nome;
    protected int numero;
    protected String cidadeDeOrigem;

    public Participante(String nome, int numero, String cidadeDeOrigem) {
        this.nome = nome;
        this.numero = numero;
        this.cidadeDeOrigem = cidadeDeOrigem;
    }

    public abstract String getNome();
}
