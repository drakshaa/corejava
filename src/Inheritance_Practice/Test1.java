package Inheritance_Practice;

public class Test1 {
	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		
		p.printparent();
		c.printchild();
		c.printparent();
	}
}
