import java.util.Scanner;
public class IT26102623Lab5Q1
{
	public static void main(String[]args)
		{
			Scanner input =new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			int num1 = input.nextInt();
			
			System.out.println("Enter the second number: ");
			int num2 = input.nextInt();
			
			System.out.println("Enter the third number: ");
			int num3 = input.nextInt();
			
			
			System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
			
			int smallest;
			int largest;
			
			if (num1 <= num2 && num1 <= num3) 
			{
            smallest = num1;
			} 
			else if (num2 <= num1 && num2 <= num3) 
			{
            smallest = num2;
			} 
			else 
			{
            smallest = num3;
			}
			
			if (num1 >= num2 && num1 >= num3) 
			{
            largest = num1;
			} 
			else if (num2 >= num1 && num2 >= num3) 
			{
            largest = num2;
			} 
			else 
			{
            largest = num3;
			}
			
			
			System.out.println("The Smallest number is: " + smallest);
			System.out.println("The Largest number is: " + largest);

		}
}
			