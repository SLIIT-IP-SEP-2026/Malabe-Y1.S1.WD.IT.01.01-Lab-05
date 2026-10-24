import java.util.Scanner;

public class IT26102376Lab5Q2
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter the number of new members introduced :");
		int newMembers = input.nextInt();
		
		if (newMembers < 0)
		{
			System.out.print("Input must be a number 0 or greater");
			return;
		}
		
		if (newMembers == 0)
		{
			System.out.println();
			System.out.println("No Prize");
		}
		
		else
		{	
		    String result = (newMembers == 1) ? "Pen":
		                    (newMembers == 2) ? "Umbrella":
	                        (newMembers == 3) ? "Bag":
						    (newMembers == 4) ? "Travelling Chair":
						    "Headphone";
			
            System.out.println();
		    System.out.println("Prize is a :" + result);
		}
	}
}	
						