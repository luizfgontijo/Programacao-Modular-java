package com.lulugol.desafio01;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String recebe = sc.nextLine();

        char[] frase = recebe.toCharArray();
        int qtd = frase.length;
        char[] invertida = new char[qtd];

        int posicao = 0;

        for (int i = qtd - 1; i >= 0; i--) {
            if (frase[i] == ' ' || i == 0) 
                {
                int inicio;
                if (i == 0) {
                    inicio = i;
                } else {
                     inicio = i + 1;
                }

                for (int j = inicio; j < qtd && frase[j] != ' '; j++) {
                    invertida[posicao] = frase[j];
                    posicao++;
                }

                if (i > 0) {
                    invertida[posicao] = ' ';
                    posicao++;
                }
            }
        }
        System.out.println(invertida);
    }
}
