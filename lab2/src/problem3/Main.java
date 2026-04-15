package problem3;

public class Main {
   public static void main(String[] args) {

	        Bank bank = new Bank();

	        SavingsAccount s1 = new SavingsAccount(1001, 0.05);
	        CheckingAccount c1 = new CheckingAccount(2001);

	        s1.deposit(1000);
	        c1.deposit(500);

	        c1.withdraw(100);
	        c1.deposit(50);
	        c1.withdraw(20);
	        c1.deposit(10);

	        bank.addAccount(s1);
	        bank.addAccount(c1);

	        System.out.println("Before update:");
	        bank.printAccounts();

	        bank.update();

	        System.out.println("\nAfter update:");
	        bank.printAccounts();
	    }
	}


