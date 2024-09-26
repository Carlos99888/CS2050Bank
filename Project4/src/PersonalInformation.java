
public class PersonalInformation extends ACCOUNT
{
	protected String address;
	protected int yearBorn;
	public PersonalInformation(int accountNumber, int balance, String owner, String address, int yearBorn) 
	{
		super(accountNumber, balance, owner);
		this.address=address;
		this.yearBorn=yearBorn;
		
	}
	
	public void setAddress(String address) 
	{
		this.address=address;
	}
	public void setYearBorn(int yearBorn) 
	{
		this.yearBorn=yearBorn;
	}
	public String getAddress() 
	{
		return address;
	}
	public int getYearBorn() 
	{
		return yearBorn;
	}

}
