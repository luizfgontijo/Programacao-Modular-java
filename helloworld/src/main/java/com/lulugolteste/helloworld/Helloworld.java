package com.lulugolteste.helloworld;
import java.util.Scanner;
public class Helloworld {

    public static void main(String[] args) {
        sum();
        /*
        This function is made for calculate the sum of two numbers.
        */
        sum();
        
    }
    static void sum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o priimeiro valor: ");
        int value1 = s.nextInt();
        System.out.println("Digite o segundo valor: ");
        int value2 = s.nextInt();
        int finalvalue;
        finalvalue = value1+value2;
        System.out.println("Valor final "+finalvalue);
    }
}
