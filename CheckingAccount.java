
public class CheckingAccount extends BankAccount {
  
	private static double insufficientFundsFee; 

   CheckingAccount() 
   {
	   
   }

 
  public CheckingAccount(double initialAmount, double fee) 
  {
    super(initialAmount);
    insufficientFundsFee = fee;
    
  }


  public void withdraw(double amount) 
  {
    super.withdraw(amount);
    
  }


  public void deposit(double amount) 
  {
    super.deposit(amount);
    
  }

  public void processCheck(double checkAmount) 
  {
	  super.withdraw(checkAmount);
    if (balance < 0) 
    {
      super.withdraw(insufficientFundsFee);
    }
    
  }
}
