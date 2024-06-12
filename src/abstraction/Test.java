package abstraction;

public class Test {
	public static void main(String[] args) {
		
		CentralBank cb = new NabilBank();
		
		cb.getBankName();
		cb.getInterestRate();
		
		UserService us = new UserServiceImp();
		us.addUser();
		us.deleteUser();
		us.print();
		
//		CommonService cs = new UserServiceImp();
//		cs.print();
		
	}
}
