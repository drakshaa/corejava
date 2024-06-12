package interface_assignment;
import java.util.Scanner;

public class TestShape {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // For rectangle
        System.out.println("Enter length of rectangle : " );
        double rlength = sc.nextDouble();
        System.out.println("Enter breadth of rectangle : " );
        double rbreadth = sc.nextDouble();
        
        //for traingle 
        System.out.println("Enter breadth of triangle : " );
        double tbreadth = sc.nextDouble();
        System.out.println("Enter height of triangle : " );
        double theight = sc.nextDouble();
        
        // for circle
        System.out.println("Enter raidus of circle : ");
        double r = sc.nextDouble();
        
        Shape c = new Circle();
        Shape rec = new Rectangle();
        Shape t = new Triangle();
        
        c.getArea();
        rec.getArea();
        t.getArea();
        
        
	}
}
