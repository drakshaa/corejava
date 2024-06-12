package javacollection;
import java.util.HashMap;
//import java.util.TreeMap;
//import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
//import java.math.*;

public class MapTest {
	public static void main(String[] args) {
		//subject - marks
//		
//		Map<String, Integer> map = new HashMap<>();
////		Map<String, Integer> map = new TreeMap<>();
////		Map<String, Integer> map = new LinkedHashMap<>();
//		map.put("English", 80);
//		map.put("Nepali", 90);
//		map.put("Science", 85);
//		map.put("Computer", 75);
//		map.put("Math", 99);
//		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		
//		for(String key : map.keySet()) {
//			System.out.println(key+ " = "+map.get(key));
//		}
		
		Map<String, List<Integer>> mlist = new HashMap<>();
		mlist.put("English", List.of(40,50,60));
		mlist.put("Computer", List.of(44,58,67));
		mlist.put("Science", List.of(80,76,81));
		mlist.put("Nepali", List.of(56,54,76));
		mlist.put("Math", List.of(81,67,78));
		
	
		for(String key : mlist.keySet()) {
//			int Total += 
			System.out.println(key+ " = " +mlist.get(key)+Total);
			
		}	
	}
}

// WAP to print student list sort by fname.
// WAP to print student list sorted by age.
// WAP to print employee list sorted by fname and salary.
