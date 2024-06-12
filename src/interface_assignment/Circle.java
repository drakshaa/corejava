package interface_assignment;

public class Circle implements Shape {
	

	@Override
	public void getArea() {
		double pi = 3.14;
		double r;
		double area = pi*r*r;
		System.out.println("Area of Circle : " +area);
	}
}
