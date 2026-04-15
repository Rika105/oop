package problem3;

public class CheckingAccount extends Account {
     private int transactionCount;
     private static final int FREE_TRANSACTIONS=3;
     
     public CheckingAccount(int number) {
    	 super(number);
     }
     
@Override
public void deposit(double amount) {
	super.deposit(amount);
	transactionCount++;
}

@Override
public void withdraw(double amount) {
	super.withdraw(amount);
	transactionCount++;
}

public void deductFee() {

    if (transactionCount > FREE_TRANSACTIONS) {

        int extra = transactionCount - FREE_TRANSACTIONS;

        super.withdraw(extra * 0.02);
    }
    transactionCount=0;  
   }

}
