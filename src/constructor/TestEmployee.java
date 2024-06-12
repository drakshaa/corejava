package constructor;
import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter Salary of Employee: ");
		int salary = sc.nextInt();
		System.out.println("Enter Work hour of Employee: ");
		int work_hours = sc.nextInt();
		
		e.getInfo(salary, work_hours);
		e.AddSal();
		e.AddWork();
		e.getSalary();
//		System.out.println("Total salary = " +e.salary);
		sc.close();
	}
}
