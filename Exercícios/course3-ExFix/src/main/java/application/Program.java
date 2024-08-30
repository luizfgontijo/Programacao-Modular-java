package application;

import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        Employee employee = new Employee();
        System.out.println("Name: ");
        employee.name = s.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = s.nextInt();
        System.out.println("Tax: ");
        employee.tax=s.nextInt();
        System.out.println(employee);
        System.out.println("Which percentago to increase saalary: ");
        int percentage = s.nextInt();
        employee.increaseSalary(percentage);
        System.out.println("Uptade data: "+ employee);
    }
    
   
}
