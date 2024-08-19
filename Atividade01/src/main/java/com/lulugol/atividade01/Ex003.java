/*
Implemente um programa em Java que receba as informações NOME, SEXO e
DATA-NASCIMENTO de no mínimo 10 funcionários de uma determinada empresa e
apresente como resultados:
a) Um relatório contendo o NOME, SEXO, DATA-NASCIMENTO e a idade de todos os
funcionários.
b) Ao final do relatório imprimir:
i) a quantidade total de funcionários
ii) a quantidade e o percentual total de funcionários do sexo feminino
iii) a quantidade e o percentual total de funcionários do sexo masculino
iv) a idade média geral dos funcionários
v) a idade média dos funcionários do sexo feminino
vi) a idade média dos funcionários do sexo masculino
*/
package com.lulugol.atividade01;

import java.util.Scanner;

public class Ex003 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        int r =1; 
        String[] name = null;
        String[] gender = null;
        int[] born=null; 
        int total = 0;
        int i=0;
        while (r==1){
            total ++;
            System.out.println("Digite o nome do seu funcionario: ");
            name[i]= s.nextLine();
            System.out.println("Digite o sexo do seu funcionario: ");
            gender[i]= s.nextLine();
            System.out.println("Digite o ano de nascimento do funcionario: ");
            born[i]= s.nextInt();
            
            System.out.println("Deseja continuar? ");
            String c = s.nextLine();
            if (c=="Sim"){
                r =1;
            }
            else {
                r = 2;
            }
        }
        for (i=0;i<total;i++){
            System.out.println("Nome: "+name[i]);
            System.out.println("Sexo: "+gender[i]);
            int[] idade = null;
            idade[i]=2024 - born[i];
            System.out.println("Idade: "+ idade[i]);
        }
            
        
    }
}
