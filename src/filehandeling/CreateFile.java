package filehandeling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	
	/*
	 * a. FileInputStream: read file
	 * b. FileOutputStream: write file
	 */
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("e://hello.txt");
		file.write("Good morning".getBytes());
		file.close();
		System.out.println("Success");
	}

}
