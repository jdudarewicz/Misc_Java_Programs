/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
   Source: Big Java
*/
public class BankAccount
{  
    //instance variables
    private double balance; //the money in the account

    /**
       Constructs a bank account with a zero balance.
    */
    public BankAccount()
    {   
	balance = 0;
    }
    
    /**
       Constructs a bank account with a given balance.
       @param aBalance the initial balance
    */
    public BankAccount(double aBalance)
    {   
	balance = aBalance;
    }
    
    /**
       Deposits money into the bank account.
       @param amount the amount to deposit
    */
    public void deposit(double amount)
    {  
	double newBalance = balance + amount;
	balance = newBalance;
    }
    
    /**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {   
	double newBalance = balance - amount;
	balance = newBalance;
    }
    
    /**
       Gets the current balance of the bank account.
       @return the current balance
    */
    public double getBalance()
    {   
	return balance;
    }
    /**
       Gives a string representation of the bankaccount,
       but in this case the string is just the balance.
       @return the balance as a string
    */
    public String toString()
    {   
	return "" + balance ;
    }
    
}



