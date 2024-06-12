package javacollection;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("Hari");
		list.add("Ram");
		list.add("Krishna");
		list.add("Shiva");
		list.add("Radha");
		
		list.remove(2);
		list.remove("Ram");
		System.out.println(list.contains("Shiva"));
		
		for(String s : list) {
			System.out.println(s);
		}
		
//		List<Student> list = new ArrayList<>();
//		Student s1 = new Student();
//		s1.setId(1234);
//		
//		slist.add(s1);
		
//		#create list of book
//		#create list of  dog
//		
	}

}
