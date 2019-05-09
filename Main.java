package BankingApplication;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Account Number: ");
		int accNo = in.nextInt();
		System.out.println("Account Holder Name: ");
		String accHolName = in.next();
		System.out.println("Account Type: ");
		String accType = in.next();
		System.out.println("Account Balance: ");
		int accBal = in.nextInt();
		
		Account ac = new Account(accNo, accHolName, accType, accBal);
		boolean temp = true;
		while(temp == true)
		{
		System.out.println("1. Credit Account\n2. Debit Account\n3. Display Account");
		System.out.println("Enter your Choice: ");
		int choice = in.nextInt();
		
		switch(choice)
		{
		   case 1:
			   System.out.println("Enter the amount to be Credited: ");
			   int credAmount = in.nextInt();
			   ac.credit(credAmount);
			   break;
			   
		   case 2:
			   System.out.println("Enter the amount to be Debited: ");
			   int debAmount = in.nextInt();
			   ac.debit(debAmount);
			   break;
		   case 3:
			   ac.displayAccDetails();
			   break;
			   
		   default:
			   temp = false;
			   break;	   
		}
		
	}
  }
}
