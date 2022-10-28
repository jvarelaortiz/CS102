public class BankAccount 
{
	
	  double balance; 
	  String owner = "";

	  
	  public BankAccount() {
	    balance = 0.00;
	    owner = "";
	  }

	 
	  public BankAccount(double initialAmount) 
	  {
	    balance = initialAmount;
	  }

	  
	  public void deposit(double amount) 
	  {
	    balance += amount;
	  }

	   
	  public void withdraw(double amount) 
	  {
		  
			  balance -= amount;
		  
	  }
	  
	  double getBalance() 
	  {
	    return balance;
	  }

	  public void transfer(BankAccount other, double amount)
	  {
	    withdraw(amount);
	    other.deposit(amount);
	  }

	  public String toString() 
	  {
	    return "Account balance: " + balance + "/nOwner: " + owner;
	  }
	  
	  
	  int main()
	  {
		  
		  SavingsAccount joeSavings = new SavingsAccount(1, 100.0);
		  CheckingAccount emilyChecking = new CheckingAccount(200, 10);
		  
		  emilyChecking.deposit(50);
		  joeSavings.withdraw(25);
		  emilyChecking.processCheck(50);
		  emilyChecking.transfer(joeSavings, 100);
		  
		  SavingsAccount samSavings = new SavingsAccount(0.5, 250.0);
		  
		  samSavings.depositMonthlyInterest();
		  joeSavings.depositMonthlyInterest();
		  
		  emilyChecking.withdraw(500);
		  joeSavings.withdraw(500);
		  
		  return 0;
	  }
	}
