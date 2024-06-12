package methodoverriding;

public class SBI extends CentralBank {
	
	@Override
	void getBankName() {
		System.out.println("SBI Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("5%");
	}
}
