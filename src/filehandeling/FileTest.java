package filehandeling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) throws IOException {
		
		File file = new File("e://employee.txt");
		
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		
		File folder = new File("e://8amfiles");
		folder.mkdir(); //create folder at runtime
		
		String[] fileNames = folder.list(); //get all files name
		System.out.println(Arrays.toString(fileNames));
//		
//		File[] files = folder.listFiles(); //get all files
//		
//		for(File fl : files) {
////			Files.readString(Path.of(fl.getAbsolutePath()));
//			System.out.println(Files.readString(Path.of(fl.getAbsolutePath())));
		}
		Files.delete(Path.of("e://hello.txt"));
		
	}

}
