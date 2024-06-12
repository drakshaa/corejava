package interface_assignment;

public class Rectangle implements Shape {
	

	@Override
	public void getArea() {
		double rlength;
		double rbreadth;
		
		double area = rlength*rbreadth;	
		System.out.println("Area of Rectangle : " +area);
		
	}

}
