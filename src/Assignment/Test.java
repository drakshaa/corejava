package Assignment;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* //student
		student s = new student();
		System.out.println("Enter Student's Name:");
		s.name = sc.next();
		System.out.println("Enter Student's Roll no.:");
		s.roll_no = sc.nextInt();
		System.out.println("Enter student's Phone no.:");
		s.phone_no = sc.nextInt();
		System.out.println("Enter student's Address:");
		s.address = sc.next();
		
		s.printStudentInfo();
		*/
		
		//Rectangle 
		rectangle r = new rectangle();
		
		System.out.println("Enter length:");
		float length = sc.nextFloat();
		System.out.println("Enter breadth:");
		float breadth = sc.nextFloat();
		
		r.setDim(length, breadth);
		r.getArea();

		sc.close();
	}

}
