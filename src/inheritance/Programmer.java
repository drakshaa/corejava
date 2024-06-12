package inheritance;

public class Programmer extends Employee {
	
	String proLang;
	String project;
	int bonus;
	
	void print() {
		
		super.print();
		
		System.out.println("Prog.Lang:" +proLang);
		System.out.println("Project:" +project);
		System.out.println("Bonus:" +bonus);
	}

}
