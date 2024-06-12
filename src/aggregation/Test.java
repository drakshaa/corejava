package aggregation;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.setColour("Red");
		c.setCompany("Tesla");
		c.setPrice(120000);
		
		Employee emp = new Employee();
		
		emp.setId(123);
		emp.setName("Ram");
		emp.setSalary(300000);
		emp.setCar(c);
		
		System.out.println("Id = " +emp.getId());
		System.out.println("Name = " +emp.getName());
		System.out.println("Salary = " +emp.getSalary());
		System.out.println("--------- Car Info --------");
		System.out.println("Colour = " +emp.getCar().getColour());
		System.out.println("Company = " +emp.getCar().getCompany());
		System.out.println("Price = " +emp.getCar().getPrice());
	}

}
