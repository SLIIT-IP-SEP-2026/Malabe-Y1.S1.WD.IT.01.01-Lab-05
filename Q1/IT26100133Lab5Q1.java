import java.util.Scanner;

public class IT26100133Lab5Q1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, Smallestnum, Largestnum;
		
		System.out.println("Enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.println("Enter the second integer: ");
		num2 = input.nextInt();
		
		System.out.println("Enter the third integer: ");
		num3 = input.nextInt();
		
		Smallestnum=num1;
		Largestnum=num1;
		
		if (num1<Smallestnum){
			Smallestnum=num2;
		}
		if (num2>Largestnum){
			Largestnum=num2;
		}
		 
		if (num3<Smallestnum){
			Smallestnum=num3;
		}
		if (num3>Largestnum){
			Largestnum=num3;
		}
		
		
		System.out.println();
		System.out.println("User entered number are : " +num1 + " " + num2 + " " + num3);
		System.out.println("The Smallest number is: " + Smallestnum);
		System.out.println("The Largest number is: " + Largestnum);
		
	}
}