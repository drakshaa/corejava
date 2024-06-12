package objectwithmethod;

public class Test {
	public static void main(String[] args) {
//		Product pd = new Product();
//		
//		p.setId(123);
//		p.setName("Car");
//		p.setPrice(12000);
//		p.setCompany("TATA");
		
		Test t = new Test();
		Product pd = t.getProductData();
		t.printProduct(pd);
	}

	// ------- object as a parameter ---------
	
	void printProduct(Product p) {

		System.out.println("Id = " + p.getId());
		System.out.println("Name = " + p.getName());
		System.out.println("Price = " + p.getPrice());
		System.out.println("Company = " + p.getCompany());

	}
	
	// -------- object as return type ----------
	
	Product getProductData() {
		Product p = new Product();
		
		p.setId(123);
		p.setName("Car");
		p.setPrice(12000);
		p.setCompany("TATA");
		
		return p;
	}
	

}

// -------- array of object as a parameter ---------
// -------- array of object as a return type -------

