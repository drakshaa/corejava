package oops;

public class rectangle {
	//properties
	
	float length;
	float breadth;
	float perimeter;
	float area;
	
	//methods
	  void printRectangleInfo() {
		  perimeter = length * breadth;
		  area = 2*(length+breadth);
	  System.out.println("Length: " +length);
      System.out.println("Breadth: " +breadth);
      System.out.println("Perimeter: " +perimeter);
      System.out.println("Area: " +area);
	  }

}
