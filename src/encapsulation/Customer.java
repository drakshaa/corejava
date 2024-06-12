package encapsulation;

// POJO or model or Entity class
public class Customer {
	private String name;
	private int age;
	private String city;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
	
}
