
public abstract class ACCOUNT 
{
	protected int accountNumber;
	protected int balance;
	protected String owner;
	
	public ACCOUNT(int accountNumber, int balance, String owner) 
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.owner=owner;
	}
	
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber=accountNumber;
	}
	
	public void setBalance(int balance) 
	{
		this.balance=balance;
	}

	public void setOwner(String owner) 
	{
		this.owner=owner;
	}
		
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	
	public int getBalance() 
	{
		return balance;
	}
	
	public String getOwner() 
	{
		return owner;
	}

}
