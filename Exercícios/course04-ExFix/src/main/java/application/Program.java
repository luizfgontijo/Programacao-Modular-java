package application;

import entities.Student;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        Student student = new Student();
        System.out.println("Name: ");
        student.name= s.nextLine();
        System.out.println("First grade: ");
        student.gradeOne= s.nextInt();
        s.nextLine();
        System.out.println("Second grade: ");
        student.gradeTwo = s.nextInt();
        s.nextLine();
        System.out.println("Third grade: ");
        student.gradeThree= s.nextInt();
        s.nextLine();
        System.out.println(student);
        if (student.passedOrFail()==0){
            System.out.println("\nPASSED!");
        }
        else{
            System.out.println("\nFAIL! "+"Missing "+ student.passedOrFail()+ "points.");
        }
        
        
        s.close();
    }
}
