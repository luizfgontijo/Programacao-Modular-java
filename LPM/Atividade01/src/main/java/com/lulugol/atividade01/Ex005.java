/*
A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados
sobre o salário e o número de filhos. Faça um método que leia esses dados para um número
não determinado de pessoas, calcule e exiba a média de salário da população (a condição
de parada pode ser um flag ou a quantidade N). Faça um programa que acione o método.
*/
package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex005 {
    static void calc(int salary, int people){
        int media;
        media = salary/people;
        System.out.println("Media de salario: "+media);
    }
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        int somaSalario=0;
        int salario=0;
        int pessoas=0;
        int filhos=0;
        int totalPessoas=0;
        int r = 1;
        while (r==1)
        {
            pessoas++;
            System.out.println("Digite seu salario: ");
            salario = s.nextInt();
            s.nextLine();
            System.out.println("Digite o numero de filhos: ");
            filhos = s.nextInt();
            s.nextLine();
            totalPessoas=pessoas+filhos;
            somaSalario=salario+somaSalario;
            System.out.println("Deseja continuar? ");
            String c = s.nextLine();
            if ("sim".equals(c)){
                r=1;
            }
            else {
                r = 69;
            }
        }
        calc (somaSalario, totalPessoas);
        
    }
            
}
