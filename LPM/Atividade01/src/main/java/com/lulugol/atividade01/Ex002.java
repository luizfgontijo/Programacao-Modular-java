/*
    Elabore um programa que preencha com 10 elementos do tipo inteiro em um vetor A.
Crie um vetor ParImpar de 2 posições e armazene no índice 0 quantos elementos de A são
par e no índice 1 quantos elementos de A são ímpar. Ao final, imprima o vetor ParImpar.
*/
package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex002 {
    
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        int vetorA[] = new int [10];
        for (int i =0; i < 10; i++){
            System.out.println("Informe o valor de A["+i+"]");
            vetorA[i] = s.nextInt();
        }
        int ParImpar[] = new int [2];
        
        for (int i = 0; i < 10; i++) {
            if (vetorA[i] % 2 == 0) {
                ParImpar[0]++; 
            } else {
                ParImpar[1]++; 
            }
        }
        
        System.out.println("Quantidade de pares: " + ParImpar[0]);
        System.out.println("Quantidade de impares: " + ParImpar[1]);
        
        s.close();  
    }
}
