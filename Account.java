import java.util.Date;
public class Account{
	
	private int id;
    private double balance; 
	private double annualInterestRate;
	private double monthlyInterestRate;//月利率
	private double monthlyInterest;//月利息
    private double amount;
     
	/**A constructor for accountnumber,totalrate,yearrate,buildtime*/
   
    public Account()
    {
    	
    }
    
	public Account(int id, double balance)
	{
		this.id= id;
		this.balance=balance;
	}
	
	
	
	/**Four get methods for accountnumber,totalmoney,yearrate,buildtime*/
	 int getid()
	 {
		return this.id;
	}	
	 
	
     double getbalance()	{ 		
	    
	  	 return this.balance;
}	
	public static void getdateCreated(Date dateCreated){
     
       dateCreated.getTime();
       System.out.println(dateCreated.toString());

	}
	double getannualInterestRate(){
		return annualInterestRate/100;
	}
	public void setannualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate=annualInterestRate;
	}

	double getmonthlyInterestRate(){
		
		monthlyInterestRate=annualInterestRate/12/1000;
		return monthlyInterestRate;
	}

	double getmonthlyInterest(){
		monthlyInterest=balance*monthlyInterestRate;
		return monthlyInterest ;
	}
	

	/**Override the toString method*/
	public String toString(){
		/**Display the class Account and Account's number*/
			return "Account  information is as following :\nid ->" + id + "\nBalance->" + this.balance+ "\nannualInterestRate->"+getannualInterestRate()+"%";
	}
	
}
