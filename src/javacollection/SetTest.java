package javacollection;
//import java.util.TreeSet;
import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
//		Set<String> set = new LinkedHashSet<>();
		
		set.add("java");
		set.add("sol");
		set.add("php");
		set.add("java");
		set.add("js");
		set.add("php");
		set.add("android");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
