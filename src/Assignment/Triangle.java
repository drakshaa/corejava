package Assignment;

public class Triangle {
	int a;
	int b;
	int c;
	
	Triangle(){
		a = 3;
		b = 4;
		c = 5;
	}
	void getPerimeter() {
		int perimeter = a + b + c;
		System.out.println("Perimeter = " +perimeter);
	}
	
	void getArea() {
		int s = (a+b+c)/2;
		int area = (s*(s-a)*(s-b)*(s-c))^(1/2);
		System.out.println("Area = " +area);
	}
	
}
