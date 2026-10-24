import java.util.Scanner;

public class IT26102376Lab5Q1
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int  smallest , largest ;
		
		System.out.print("Enter the first integer :");
		int firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer :");
		int secondInteger = input.nextInt();
		
		System.out.print("Enter the third integer :");
		int thirdInteger = input.nextInt();
		
		smallest = firstInteger;
		largest = firstInteger;
		
		if ( secondInteger < smallest )
		{
			smallest = secondInteger;
		}
		
		if ( secondInteger > largest)
		{
			largest = secondInteger;
		}
		
		if ( thirdInteger < smallest )
		{
			smallest = thirdInteger;
		}
		
		if  ( thirdInteger > largest)
		{
			largest = thirdInteger;
		}
		
		System.out.println();
		System.out.println("User entered numbers are :" + firstInteger + " " + secondInteger + " " + thirdInteger);
		System.out.println("The Smallest number is :" + smallest);
		System.out.println("The Largest number is :" + largest);
	}
}
			
		
		
