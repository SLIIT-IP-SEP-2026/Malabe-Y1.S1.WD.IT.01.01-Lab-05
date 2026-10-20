import java.util.Scanner;

public class IT26101970Lab5Q1{
	
	public static void main(String[] args){
		
		// Creating a scanner input
		Scanner input = new Scanner(System.in);
		
		// Declaring the variables
		int num1, num2, num3;
		int smallest, largest;
		
		// Getting input
		System.out.print("Enter the first digit: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3 = input. nextInt();
		
		// Showing the entered numbers
		System.out.println();
		System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);
		
		// Comparing the numbers
		largest = num1;
		smallest = num1;
		
		if(num2 < smallest){
			smallest = num2;
		} 
		if (num2 > largest){
			largest = num2;
		}
		
		if(num3 < smallest){
			smallest = num3;
		} 
		if(num3 > largest){
			largest = num3;
		}
		
		// Displaying the output
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The largest number is: " + largest);
	}
}