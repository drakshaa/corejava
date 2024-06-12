package javacollection;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Student s1 = new Student();
		s1.setFname("Ram");
		s1.setLname("Sah");
		s1.setAge(20);
		
		list.add(s1);
		for(Student s : list) {
			System.out.println(s);
			
		}
	}
}
