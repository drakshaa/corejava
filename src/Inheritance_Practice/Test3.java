package Inheritance_Practice;

public class Test3 {
	public static void main(String[] args) {
		Employee e = new Employee();
		Manager m = new Manager();

		e.name = "John";
		e.age = 18;
		e.phone_num = "98726238192";
		e.address = "Kathmandu";
		e.salary = 10000;
		e.specialization = "java";

		m.name = "Ram";
		m.age = 20;
		m.phone_num = "98762381281";
		m.address = "Lalitpur";
		m.salary = 30000;
		m.department = "PR";

		System.out.println("Employee:");
		System.out.println("Name: " + e.name);
		System.out.println("Age: " + e.age);
		System.out.println("Phone Number: " + e.phone_num);
		System.out.println("Address: " + e.address);
		System.out.println("Specialization: " + e.specialization);
		System.out.println("Salary: " +e.salary);

		System.out.println("\nManager:");
		System.out.println("Name: " + m.name);
		System.out.println("Age: " + m.age);
		System.out.println("Phone Number: " + m.phone_num);
		System.out.println("Address: " + m.address);
		System.out.println("Department: " + m.department);
		System.out.println("Salary: " +m.salary);
	
		
	}
}
