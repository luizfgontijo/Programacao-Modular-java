package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex007 {
    public static int[] primeiroVetor(int r) {
        int[] vetor = new int[r];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    public static int[] segundoVetor(int r) {
        int[] vetor = new int[r];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < r; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    public static int[] somaVetores(int r, int[] vetorX, int[] vetorY) {
        int[] vetor = new int[r];
        for (int i = 0; i < r; i++) {
            vetor[i] = vetorX[i] + vetorY[i];
        }
        return vetor;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual será o tamanho dos vetores?");
        int n = s.nextInt();

        int[] vetorA = primeiroVetor(n);
        int[] vetorB = segundoVetor(n);
        int[] vetorS = somaVetores(n, vetorA, vetorB);

        System.out.println("Vetor final: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetorS[i]);
        }
    }
}
