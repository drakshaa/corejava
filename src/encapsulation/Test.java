package encapsulation;

public class Test {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.setName("Raju KC");
		c.setCity("Pokhara");
		c.setAge(30);
		c.setPhone("987218281939");
		
		System.out.println(c);
		
//		System.out.println("Name:" +c.getName());
//		System.out.println("age:" +c.getAge());
//		System.out.println("phone:" +c.getPhone());
//		System.out.println("city:" +c.getCity());
		
//		c.name = "Roman Giri";
//		c.age = 20;
//		c.phone = "98123420348";
//		c.city = "Pokhara";
		
//		System.out.println("Name:" +c.name);
//		System.out.println("age:" +c.age);
//		System.out.println("phone:" +c.phone);
//		System.out.println("city:" +c.city);
	}
}
