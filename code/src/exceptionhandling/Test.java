package exceptionhandling;

public class Test {

	public static void main(String[] args) {
		SBIBank sbi=new SBIBank();
		try {
		int amount=sbi.withdraw(4000);
		System.out.println(amount);
		}catch(InsufficientBalance insb) {
			System.out.println(insb.getMessage());
		}
		int cash=sbi.getBalance();
		System.out.println(cash);

	}

}
