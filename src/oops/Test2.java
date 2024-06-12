package oops;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* // book
		book b = new book();
		
		System.out.println("Enter name:\n");
		b.name = sc.next();
		System.out.println("Enter author:\n");
		b.author = sc.next();
		System.out.println("Enter price:\n");
		b.price = sc.nextInt();
		System.out.println("Enter pages:\n");
		b.pages =sc.nextInt();
		
		b.printBookInfo(); 
		
		//Car
		
		car c = new car();
		System.out.println("Enter car model:");
        c.model = sc.next();
        System.out.println("Enter car company:");
        c.company = sc.next();
        System.out.println("Enter car price:");
        c.price = sc.nextInt();
        
        c.printCarInfo(); 
        
		//student
		
        student s = new student();
        System.out.println("Enter student's name:");
        s.name = sc.next();
        System.out.println("Enter student's roll no.");
        s.roll_no = sc.nextInt();
        System.out.println("Enter student's age");
        s.age = sc.nextInt();
        System.out.println("Enter student's grade");
        s.grade = sc.nextInt();
        
        s.printStudentInfo();
        */
		
		//Rectangle 
		rectangle r = new rectangle();
		System.out.println("Enter length of rectangle:");
		r.length = sc.nextFloat();
		System.out.println("Enter breadth of rectangle:");
		r.breadth = sc.nextFloat();
		r.printRectangleInfo();
		
        sc.close();
		
		
	}
}
