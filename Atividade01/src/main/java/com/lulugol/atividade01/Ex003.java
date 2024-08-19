/*
Implemente um programa em Java que receba as informações NOME, SEXO e
DATA-NASCIMENTO de no mínimo 10 funcionários de uma determinada empresa e
apresente como resultados:
a) Um relatório contendo o NOME, SEXO, DATA-NASCIMENTO e a idade de todos os
funcionários.
*/
package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex003 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        int r =1; 
        String name[] = new String[50];
        String gender[] = new String[50];
        int born[] = new int [50]; 
        int total = 0;
        int i=0;
        String c;
        while (r==1){
            total ++;
            System.out.println("Digite o nome do seu funcionario: ");
            name[i]= s.nextLine();
            System.out.println("Digite o sexo do seu funcionario: ");
            gender[i]= s.nextLine();
            System.out.println("Digite o ano de nascimento do funcionario: ");
            born[i]= s.nextInt();
            s.nextLine();
            System.out.println("Deseja continuar? ");
            c = s.nextLine();
            if ("Sim".equals(c)){
                r =1;
            }
            else {
                r = 2;
            }
            i++;
        }
        for (i=0;i<total;i++){
            System.out.println("Nome: "+name[i]);
            System.out.println("Sexo: "+gender[i]);
            int[] idade = new int [50];
            idade[i]=2024 - born[i];
            System.out.println("Idade: "+ idade[i]);
        }
        s.close();
            
        
    }
}