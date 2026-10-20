import java.util.Scanner;

public class IT26101227Lab5Q1{
	
	public static void main (String[] args){
		
		int firstInteger, secondInteger, thirdInteger, smallest, largest; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first Integer: ");
		firstInteger = input.nextInt();
		
		System.out.print("Enter the second Integer: ");
		secondInteger = input.nextInt();
		
		System.out.print("Enter the third Integer: ");
		thirdInteger = input.nextInt();
		
	    smallest = firstInteger;
		largest = firstInteger;
		
		if (secondInteger < smallest){
			smallest = secondInteger;			
		}
		
		if (secondInteger > largest){
			largest = secondInteger;
		}
		
		if (thirdInteger < smallest){
			smallest = thirdInteger;
		}
		
		if (thirdInteger > largest){
			largest = thirdInteger; 
		}
		
		System.out.println();
		System.out.println("User entered numbers are : " + firstInteger + " " + secondInteger + " " + thirdInteger);
		System.out.println("The Smallest number is: " + smallest);
		System.out.println("The Largest number is " + largest);
		
	}
}