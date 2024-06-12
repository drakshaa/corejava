package methodoverriding;

public class NMB extends CentralBank {
	
	@Override
	void getBankName() {
		System.out.println("NMB Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("15%");
	}
}
