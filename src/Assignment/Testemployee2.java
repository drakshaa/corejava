package Assignment;

import java.util.Scanner;

public class Testemployee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee2 e = new Employee2();

        System.out.println("Enter Employee's salary:");
        int salary = sc.nextInt(); 

        System.out.println("Enter Employee's work hour per day:");
        int work_hour = sc.nextInt(); 

        e.getInfo(salary, work_hour);  

        e.AddSal();  
        e.AddWork();  

        e.printFinalSalary();  
        sc.close();
    }
}
