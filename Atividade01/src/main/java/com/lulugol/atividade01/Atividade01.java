/*
    Faça um programa que leia um vetor A com 15 elementos inteiros. Em seguida, construa
um vetor B do mesmo tipo, em que cada elemento de B deva ser o resultado do fatorial
correspondente de cada elemento de A. Imprima na tela os vetores A e B.
*/
package com.lulugol.atividade01;

import java.util.Scanner;

public class Atividade01 {
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in);
        int vetor []= new int [5];
        for (int i=0; i<5; i++)// alterar pra 15 depois dos testes
        {
            System.out.println("Digite o A["+ i +"]");
            vetor [i] = s.nextInt();
        }
        System.out.println("");
        int vetorFat[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            int fat = 1;
            for (int j = 1; j <= vetor[i]; j++) {
                fat *= j;
            }
            vetorFat[i] = fat;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Fatorial de " + vetor[i] + " = " + vetorFat[i]);
        }
        s.close();
    }
}
