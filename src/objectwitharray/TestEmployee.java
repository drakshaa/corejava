package objectwitharray;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {

		Employee emp[] = new Employee[2];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			Employee e = new Employee();

			System.out.println("Enter Id:");
			e.setId(sc.nextInt());
			System.out.println("Enter Name:");
			e.setName(sc.next());
			System.out.println("Enter Company:");
			e.setCompany(sc.next());
			System.out.println("Enter Salary:");
			e.setSalary(sc.nextInt());
			System.out.println("Enter Department");
			e.setDepartment(sc.next());
			System.out.println("Enter Post");
			e.setPost(sc.next());
			System.out.println("Enter City:");
			e.setCity(sc.next());
			emp[i] = e;
		}

		for (Employee e : emp) {
			System.out.println(e);
		}

		int salary = 0;
		for (Employee e : emp) {
			salary += e.getSalary();
		}
		System.out.println("Total salary = $" +salary);
		
		for(Employee e : emp) {
			if(e.getDepartment() == "IT") {
				System.out.println(e);
			}
		}
		
		int count1 = 0;
		for(Employee e : emp) {
			if(e.getDepartment() == "Admin") {
				count1++;
			}
		}
		System.out.println("Employees of Admin department: " +count1);
		
		int count2 = 0;
		for(Employee e : emp) {
			if(e.getCity()=="Kathmandu") {
				count2++;
				System.out.println(e);
			}
		}
		System.out.println("Number of Employee in Kathmandu: " +count2);
		
		int salaryIT = 0;
		for(Employee e : emp) {
			if(e.getDepartment() == "IT") {
				salaryIT += e.getSalary();
			}
		}
		System.out.println("Total salary of IT department : " +salaryIT);
		
		
	}
}
