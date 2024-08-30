package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main (String[]args){
        
        Scanner s = new Scanner (System.in);
        
        Rectangle rectangle = new Rectangle();
        System.out.println("Height: ");
        rectangle.height = s.nextInt();
        System.out.println("");
        System.out.println("Width: ");
        rectangle.width = s.nextInt();
        s.nextLine();
        System.out.println("");
        
        System.out.println(rectangle);
    }
    
}
