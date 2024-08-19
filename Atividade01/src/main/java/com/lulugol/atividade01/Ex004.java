
package com.lulugol.atividade01;

import java.util.Scanner; 

public class Ex004 {
    static void calc(int first, int second, int third, String tipo){
        int media=0;
        if ("A".equals(tipo)){
                media = (first+second+third)/3;
            }
        if ("P".equals(tipo)){
                media = ((first*5)+(second*3)+(third*2))/10;
            }
        System.out.println("Media: "+media);
    }
    public static void main(String[]srgs){
        Scanner s = new Scanner (System.in);
        int n; 
        System.out.println("Quantos alunos (N): ");
        n = s.nextInt();
        s.nextLine();
        for (int i=0;i<n;i++)
        {
            System.out.println("Digite a primeira nota: ");
            int firstGrade = s.nextInt();
            s.nextLine();
            System.out.println("Digite a segunda nota: ");
            int secondGrade = s.nextInt();
            s.nextLine();
            System.out.println("Digite a terceira nota: ");
            int thirdGrade = s.nextInt();
            s.nextLine();
            System.out.println("Digite A para calculo de media aritmetica e P para calculo de media ponderada: ");
            String type = s.nextLine();
            calc (firstGrade, secondGrade, thirdGrade, type);
        }
    }
    
}
