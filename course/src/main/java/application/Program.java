package application;

import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        
        Product product = new Product();
        System.out.println("Insira os dados do produto: ");
        System.out.println("Nome: ");
        product.name= s.nextLine();
        System.out.println("Preco: ");
        product.price = s.nextInt();
        s.nextLine();
        System.out.println("Quantidade em estoque: ");
        product.quantity= s.nextInt();
        s.nextLine();
        
        System.out.println(product.name + ", "+ product.price + ", "+product.quantity);
                
        
        s.close();
    }
}
