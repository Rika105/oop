package problem3;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount(int number,double rate) {
		super(number);
		interestRate= rate;
	}
	
	public void addInterest() {
		double interest=getBalance() * interestRate;
		deposit(interest);
	}

}
