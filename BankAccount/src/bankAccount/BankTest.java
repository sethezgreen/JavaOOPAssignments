package bankAccount;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create 3 Bank Accounts
		BankAccount bank1 = new BankAccount(100, 5000);
		BankAccount bank2 = new BankAccount(400, 10000);
		BankAccount bank3 = new BankAccount(50, 800);
		
		// Bank 1 Testing
		System.out.println("\n --- Bank 1 --- \n");
		
		// Account Number Test
		System.out.println("Account Number: " + bank1.getAccountNumber());
		
		// Deposit Test
		bank1.depositSavings(500);
		System.out.println("Savings: " + bank1.getSavingsBalance());
		
		// Withdraw Test
		bank1.withdrawSavings(1000);
		System.out.println("Savings: " + bank1.getSavingsBalance());
		
		bank1.withdrawChecking(500);
		System.out.println("Checking: " + bank1.getCheckingBalance());
		
		// getBalance Test
		System.out.println("Total Balance: " + bank1.getBalance());
		
		
		// Bank 2 Testing
		System.out.println("\n --- Bank 2 --- \n");
		
		// Account Number Test
		System.out.println("Account Number: " + bank2.getAccountNumber());
		
		// Deposit Test
		bank2.depositSavings(500);
		System.out.println("Savings: " + bank2.getSavingsBalance());
		
		// Withdraw Test
		bank2.withdrawSavings(1000);
		System.out.println("Savings: " + bank2.getSavingsBalance());
		
		bank2.withdrawChecking(500);
		System.out.println("Checking: " + bank2.getCheckingBalance());
		
		// getBalance Test
		System.out.println("Total Balance: " + bank2.getBalance());
		
		
		// Bank 3 Testing
		System.out.println("\n --- Bank 3 --- \n");
		
		// Account Number Test
		System.out.println("Account Number: " + bank3.getAccountNumber());
		
		// Deposit Test
		bank3.depositSavings(500);
		System.out.println("Savings: " + bank3.getSavingsBalance());
		
		// Withdraw Test
		bank3.withdrawSavings(1000);
		System.out.println("Savings: " + bank3.getSavingsBalance());
		
		bank3.withdrawChecking(500);
		System.out.println("Checking: " + bank3.getCheckingBalance());
		
		// getBalance Test
		System.out.println("Total Balance: " + bank3.getBalance());
		
		
		// Total Money and Accounts Test
		System.out.println("\nTotal Money: " + BankAccount.getTotalMoney());
		System.out.println("Total Accounts: " + BankAccount.getAccounts());
		
	}

}
