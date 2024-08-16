package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex001 {
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
        int fat = 0;
        for (int i =0;i <5; i++){
            int n =1;
            do {
            fat = vetor [i];
            n = fat; 
            n= n -1;
            fat = fat *n;
            }
            while (n>=1);
            vetorFat[i] = fat;
            
        }
        for ( int i =0; i <5; i++)
        {
            System.out.println(vetorFat[i]+"");
        }
        s.close();
    }
}
