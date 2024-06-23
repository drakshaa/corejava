package filehandeling;

public class ReadFile{
	
public static void main(String[] args){
	
	FileInputStream file = new FileInputStream("e://hello.txt");
	int data; 
	while((data = file.read()) != 1) {
		
		System.out.print((char)data);
	}
}
}
