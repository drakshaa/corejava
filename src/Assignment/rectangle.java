package Assignment;

public class rectangle {
	float l;
	float b;
	void setDim(float len, float brd) {
		l = len;
		b = brd;
	}
	
	void getArea() {
		float area = l*b ;
		System.out.println("Area=" +area);
	}
	
}
