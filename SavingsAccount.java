public class SavingsAccount extends BankAccount {
	  

	  private double annualInterestRate; 

	  public SavingsAccount(double rate) 
	  {
	    annualInterestRate = rate;
	  }

	  
	  public SavingsAccount(double rate, double initialAmount) 
	  {
	    super(initialAmount);  

	    annualInterestRate = rate;
	  }

	  
	  public void depositMonthlyInterest() 
	  {
	    double interest = getBalance() * annualInterestRate / 100.0;
	    deposit(interest);
	  }
	  
	  public void withdraw(double amount)
	  {
		  if ((balance -= amount) < 0)
		  {
			  System.out.print("ERROR Insufficient Fund");
			  
		  }
		  if ((balance -= amount) > 0)
		  {
			  super.withdraw(amount);
		  }
		  
	  }
	}

/*
public class SavingsAccount ​extends BankAccount
{
	//private double balance;
	//private double interest;

	public SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}





*/