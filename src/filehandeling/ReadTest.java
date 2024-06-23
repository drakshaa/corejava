package filehandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ReadTest {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("e://student.txt");
		BufferedReader br = new BufferedReader(file);
		
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
	}
	

}
