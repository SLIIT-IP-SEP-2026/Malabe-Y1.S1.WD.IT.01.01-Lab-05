import java.util.Scanner;

public class IT26102472Lab5Q1{
	
	public static void main(String[]args){
		
		int first_integer, second_integer, third_integer, smallest_number, largest_number, smallest, largest;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
		first_integer = input.nextInt();
		
		System.out.println("Enter the second integer");
		second_integer = input.nextInt();
		
		System.out.println("Enter the third integer");
		third_integer = input.nextInt();
		
		smallest =  first_integer;
		largest = second_integer;
		
		if (second_integer < smallest){
			smallest = second_integer;
		}
		
		if (second_integer > largest){
			largest = second_integer;
		}
		
		if (third_integer < smallest){
			smallest = third_integer;
		}
		
		if (third_integer > largest){
			largest = third_integer;
		}
		
		
		
		System.out.println("User entered numbersare:" +first_integer+ " " +second_integer+ " " +third_integer);
		System.out.println("The Smallest Number is :" +smallest);
		System.out.println("The largest number is :" +largest);
		
	}
}
		