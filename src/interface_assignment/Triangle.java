package interface_assignment;

public class Triangle implements Shape{

	@Override
	public void getArea() {
		double tbreadth;
		double theight;
		double area = 0.5* tbreadth* theight;
		System.out.println("Area of Triangle : " +area);
	}

}
