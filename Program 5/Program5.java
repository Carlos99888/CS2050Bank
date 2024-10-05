import java.util.Random;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Program5 
{

	public static void main(String[] args) throws Exception 
	{
		int range = 1000000;
		String owner = "";
		Random randomAccountSavings= new Random();
		Random randomAccountCheckings= new Random();
		Random randomSavingsBalance = new Random();
		Random randomCheckingsBalance = new Random();
		Random randomBalance = new Random();
		int savingsNumAccount, checkingsNumAccount, savingsBalance, checkingsBalance;
		
		Checkings checkings = null;
		Savings savings = null;
		
		AccountStack<Object> savingsStack = new AccountStack<>();
		AccountStack<Object> checkingsStack = new AccountStack<>();
		
			
		for(int i =0; i < 25; i++) 
		{
			//owner name for each account
			owner = "Carlos"+(i+1);
			
			//generating random numbers
			savingsNumAccount = randomAccountSavings.nextInt(range);
			checkingsNumAccount = randomAccountCheckings.nextInt(range);
			savingsBalance = randomSavingsBalance.nextInt(range);
			checkingsBalance = randomCheckingsBalance.nextInt(range);
			//creating Savings and Checkings object
			checkings = new Checkings(checkingsNumAccount, checkingsBalance, owner);
			savings = new Savings(savingsNumAccount, savingsBalance, owner);
			//adding savings and checking objects to stack
			checkingsStack.push(checkings);
			savingsStack.push(savings);
		}
		
		ObjectOutputStream outputFile1 = new ObjectOutputStream(new FileOutputStream("SaveStack.dat"));
		ObjectOutputStream outputFile2 = new ObjectOutputStream(new FileOutputStream("CheckStack.dat"));
		outputFile1.writeObject(savingsStack);
		outputFile1.close();
		outputFile2.writeObject(checkingsStack);
		outputFile2.close();
		
		System.out.println(checkingsStack.peek());
	}
}
