package exceptionhandling;

public class SBIBank {
	private static int balance=5000;
	public String deposit(int amount) {
		balance=balance+amount;
		return "Total balance in your account "+balance;
		
	}
	public int withdraw(int amount) throws InsufficientBalance {
		if(balance>=amount) {
			balance=balance-amount;
			return amount;
		}else
		{
			throw new InsufficientBalance("Insufficient balance in your account!!");
		}
		
	}
	public static int getBalance() {
		return balance;
	}

}
