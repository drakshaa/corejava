package filehandeling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTest {
	
	/*
	 * a. FileReader : Read file
	 * b. FileWriter : Write file
	 */

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("e://student.txt",); 
		
		// to add in exisiting file 
		//FileWriter file = new FileWriter("e://student.txt",true); 
		
		file.write("Id = 3344\n");
		file.write("Name = Ram\n");
		file.write("address = kathmandu\n");
		
		file.close();
		System.out.println("Sucess");
		
	}
}
