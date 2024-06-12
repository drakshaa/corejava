package javacollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,56,6,3,2,5,1,67);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
	}
}
