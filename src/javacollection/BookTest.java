package javacollection;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		Book b1 = new Book();
		b1.setTitle("Harry Potter");
		b1.setAuthor("jk");
		b1.setPrice("1000");
		
		list.add(b1);
		
		for(Book b : list) {
			System.out.println(b);
		}
	}
}