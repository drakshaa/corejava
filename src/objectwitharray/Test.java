package objectwitharray;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// store and print data of 5 students
		
		// create array
		Student students[] = new Student[5];
		
		// write data in array
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<students.length; i++) {
		Student s = new Student ();
		
		System.out.println("Enter First Name:");
		s.setFname(sc.next());
		System.out.println("Enter Last Name:");
		s.setLname(sc.next());
		System.out.println("Enter Id:");
		s.setId(sc.nextInt());
		System.out.println("Enter Age:");
		s.setAge(sc.nextInt());
		System.out.println("Enter City:");
		s.setCity(sc.next());
		System.out.println("Enter collage:");
		s.setCollage(sc.next());
		students[i] = s;
		}
		
		// read data from array
		for(Student s : students ) {
			System.out.println(s);
		}
	}
}
