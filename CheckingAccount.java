import java.util.Date;
import java.util.Scanner;


public class CheckingAccount extends Account{

	
	 private int id;
	 private double balance;
	 private double amount;
     private double annualInterestRate;
	
	 
	public CheckingAccount(int id, double balance, double amount,double annualInterestRate) {
		// TODO Auto-generated constructor stub
	super(id, balance);
	this.id=id;
	this.balance=balance;
	this.amount=amount;
	this.annualInterestRate=annualInterestRate;

	}
		
	public void  withdrawfromCheckingAccount()
	{
		
		
		
		if (amount>balance)	
		{
					
			System.out.println("餘額不足，您無法提款\n");
		}
		else
		{
			balance=balance-amount;
			
			System.out.println("提款成功\n");
		}
	
	
	}
	
	
	public void  deposittoCheckingAccount()
	{
		balance=balance+amount;
	    System.out.println("存款成功，歡迎再度光臨\n");
    
	}
	public double getamount()
	{
		return amount;
	}
	
	public String toString()
	{
		/**Display the class Account and Account's number*/
			return "Account  information is as following :\nid ->" + id + "\nBalance->" +balance+ "\nannualInterestRate->"+annualInterestRate/100+"%";
	}
	
}
