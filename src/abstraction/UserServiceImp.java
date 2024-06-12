package abstraction;

public class UserServiceImp extends CentralBank implements UserService,CommonService {

	@Override
	public void addUser() {
		System.out.println("added success");
	}

	@Override
	public void deleteUser() {
		System.out.println("deleted success");
	}

	@Override
	public void print() {
		System.out.println("...printing");
		
	}

	@Override
	void getBankName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getInterestRate() {
		// TODO Auto-generated method stub
		
	}
}
