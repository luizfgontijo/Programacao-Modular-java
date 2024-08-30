/*
Faça um procedimento que recebe 3 valores inteiros por parâmetro e os exiba em ordem
crescente. Faça um programa que leia N conjuntos de 3 valores e acione o procedimento
para cada conjunto (N deve ser lido do teclado)
*/
package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex006 {
    static void calc (int numberOne, int numberTwo, int numberThree){
        int menorNumero = numberOne;
        int meioNumero = numberOne; 
        int maiorNumero = numberOne;
        if (numberTwo<menorNumero){
            menorNumero=numberTwo; 
        }
        if(numberThree<menorNumero){
            menorNumero=numberThree;
        }
        if(numberTwo>maiorNumero){
            maiorNumero=numberTwo;
        }
        if(numberThree>maiorNumero){
            maiorNumero=numberThree;
        }
        if((numberTwo<maiorNumero)&&(numberTwo>menorNumero)){
            meioNumero=numberTwo;
        }
        if((numberThree<maiorNumero)&&(numberThree>menorNumero)){
            meioNumero=numberThree;
        }
        System.out.println("Maior numero: "+maiorNumero);
        System.out.println("Numero do meio: "+meioNumero);
        System.out.println("Menor numero: "+menorNumero);
    }
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        System.out.println("Digite o numero de conjuntos N que serao lidos: ");
        int n = s.nextInt();
        s.nextLine();
        for (int i=0; i<n; i++){
            System.out.println("Digite o primeiro numero: ");
            int number1 = s.nextInt();
            s.nextLine();
            System.out.println("Digite o segundo numero: ");
            int number2 = s.nextInt();
            s.nextLine();
            System.out.println("Digite o terceiro numero: ");
            int number3 = s.nextInt();
            s.nextLine();
            calc (number1, number2, number3);
        }
    }
}
