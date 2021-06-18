import java.util.Scanner;


public class Internet {
	public static void main (String args[])
	{
		while (true)
		{
			printMonthlyBill(calculateBill(getHours(), menu()));
		}
	}
	
	public static double getHours()
	{
		int hours;
		
		Scanner inputHours = new Scanner (System.in);
		
		System.out.print("Please enter the hours used: ");
		hours = inputHours.nextInt();
		
		inputHours.close();
		
		return hours;
	}
	
	public static int menu ()
	{
		int packageChoice;
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("[1] Package A");
		System.out.println("[2] Package B");
		System.out.println("[3] Package C");
		System.out.print("Please select your package: ");
		packageChoice = userInput.nextInt();
		userInput.close();
		
		return packageChoice;
	}
	
	public static double calculateBill(double hours, int packageChoice)
	{
		switch (packageChoice)
		{
			case 1:
				if (hours < 10)
				{
					return 9.95;
				}
				
				else
				{
					return (hours - 10)*2 + 9.95;
				}
				
			case 2:
				if (hours < 20)
				{
					return 13.95;
				}
				
				else
				{
					return (hours - 20) + 13.95;
				}			
			case 3:
				return 19.95;
				
			default:
				System.out.println("Invalid input!");
				return 0;
		}
	}
	
	public static void printMonthlyBill(double bill)
	{	
		System.out.println("Your monthy bill is $" + bill);
	}
}