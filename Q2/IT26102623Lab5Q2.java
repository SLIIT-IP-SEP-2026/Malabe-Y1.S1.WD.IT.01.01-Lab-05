import java.util.Scanner;
public class IT26102623Lab5Q2
{
	public static void main(String[]args)
		{
			Scanner input =new Scanner(System.in);
			
			
			
			System.out.print("Enter the number of new members introduced: ");
			int cust_count=input.nextInt();
			
			if (cust_count >= 5)
			{
					System.out.println("The prize is Headphones");
			}	
			else if(cust_count >= 4 )
			{
					System.out.println("The prize is Travelling Chair ");
			}
			else if(cust_count >= 3 )
			{
					System.out.println("The prize is Bag ");
			}	
			else if(cust_count >= 2 )
			{
					System.out.println("The prize is Umbrella ");
			}	
			else if(cust_count >= 1 )
			{
					System.out.println("The prize is Pen");
			}
			else
			{
			System.out.println("Sorry, You are not entitled for gift");
			}
			
		}
}
			
				
			