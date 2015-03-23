import java.util.*;
public class Accountinformation{
	/**Main method*/
	public static void main(String[] args){
		
		/**Create the objects named AccountNumber,TotalMoney,YearRate,BuildTime*/
		Account account = new Account(1122,20000.0);
		Scanner input=new Scanner(System.in);
		account.setannualInterestRate(450);
		account.getannualInterestRate();
		             
		Date dateCreated=new Date();
		System.out.print("建立時間：");
		account.getdateCreated(dateCreated);
		System.out.println( account.toString());    
		System.out.println("請選擇:\n1.提款\n2.存款 ：\n>>");      
		int selection=input.nextInt();
    
     double amount;
     if (selection==1)
     { 
    	 System.out.println("請問想從哪一個帳戶提錢：\n1.Saving Account\n2.Checking Account\n>>");
         int option=input.nextInt();
         if(option==1)
        {
        	 System.out.println("請問提多少錢？");
        	 amount=input.nextInt();
        	 SavingAccount SA=new SavingAccount(1122,40000,amount,250);
        	 SA.withdrawfromSavingAccount();
        	 System.out.println( SA.toString());
        	 
        }
        else
        {
        	 System.out.println("請問提多少錢？");
        	 amount=input.nextInt();
        	 CheckingAccount CA=new CheckingAccount(2211,20000,amount,450);
        	 CA.withdrawfromCheckingAccount();
        	 System.out.println( CA.toString());
        }
     }
     else
     {
    	 System.out.println("請問想從哪一個帳戶存錢：\n1.Saving Account\n2.Checking Account\n>>");
         int option=input.nextInt();             
         if(option==1)
        {
        	 System.out.println("請問存多少錢？");
        	 amount=input.nextInt();
        	 SavingAccount SA=new SavingAccount(1122,40000,amount,250);
        	 SA.deposittoSavingingAccount();
        	 System.out.println( SA.toString());
        }
        else
        {
        	 System.out.println("請問存多少錢？");
        	 amount=input.nextInt();
        	 CheckingAccount CA=new CheckingAccount(2211,20000,amount,450);
        	 CA.deposittoCheckingAccount();
            System.out.println( CA.toString());
        	
        }
     }
      
		
		
	}
	
}
