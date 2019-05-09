package BankingApplication;

public class Account {
	
	int accNo = 0;
	String accHolName = null;
	String accType = null;
	int accBal = 0;
	public Account(int accNo, String accHolName, String accType, int accBal)
	{
		this.accNo = accNo;
		this.accHolName = accHolName;
		this.accType = accType;
		this.accBal = accBal;
	}
	
	public void credit(int credAmount)
	{
		accBal += credAmount;
	}
	
	public void debit(int debAmount)
	{
		if(accBal < debAmount)
			System.out.println("Insufficiant Balance: ");
		else
		   accBal -= debAmount;
	}
	
	public void displayAccDetails()
	{
		System.out.println("Account Details\nAccount Number: "+accNo +"\nAccount Name: "+accHolName +"\nAccount Type: "+accType +"\nAccount Balance: "+accBal);
	}

}
