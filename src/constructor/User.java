package constructor;

public class User {
	// instance variable 
	String userName;
	String password;
	
	//------- Default Constructor --------
//	User(){
//		userName = "root";
//		password = "123";
//	}
	//---- Parameterized Constructor -----
	User(String userName, String password){
		
//		this(); //default constructor
//		this(123, 1234); //parameterized constructor 
//		this.printUser(); //method call using this 

		this.userName = userName;
		this.password = password;
		
		/*
		 *  - "this" keyword represents current object.
		 *  - we can call following using "this" :
		 *  a. instance variables
		 *  b. instance methods
		 *  c. constructors
		 */
	}
	
	void printUser() {
		System.out.println("Username = " +userName);
		System.out.println("Password = " +password);
	}
	public static void main(String[] args) {
		User u = new User("ram", "89898");
		u.printUser();
		
	}
}
