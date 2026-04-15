package problem3;

public class Account {
	private  double balance;
	private int accNumber;
	
	
	public Account(int number) {
		accNumber=number;
		balance=0;
	}
	
    public void deposit(double sum) {
    	balance+=sum;
    }
    
    public void withdraw(double sum) {
    	balance-=sum;
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public double getAccountNumber() {
    	return accNumber;
    }
    
    public void transfer(double amount, Account other) {
    	withdraw(amount);
    	other.deposit(amount);
    }
    
@Override
public String toString() {
	return "Account " + accNumber + " balance " + balance; 
}

public final void print() {
    System.out.println(toString());
}


}
