package application;

import java.util.Scanner;
import entities.CurrencyConverter;

public class Program {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double dollarPrice = s.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = s.nextDouble();
        
        double result= CurrencyConverter.dollarToReal(dollarPrice, amount);
        System.out.println("Amount to be paid in reais "+ result) ;
        
        s.close();
    }
}
