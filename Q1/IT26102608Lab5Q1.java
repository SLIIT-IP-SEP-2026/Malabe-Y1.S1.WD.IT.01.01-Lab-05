import java.util.Scanner;

public class IT26102608Lab5Q1{
	
	public static void main(String[]args){
		
		int smallestInt, largestInt; 
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int int1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int int2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int int3 = input.nextInt();
		System.out.println("");
		
		if (int1 > int2 && int1 > int3){
			largestInt = int1;
		}
		else if (int2 > int1 && int2 > int3){
			largestInt = int2;	
		}
		else{
			largestInt = int3;
		}
		
		if (int1 < int2 && int1 < int3){
			smallestInt = int1;
		}
		else if (int2 < int1 && int2 < int3){
			smallestInt = int2;	
		}
		else{
			smallestInt = int3;
		}
		
		System.out.println("User entered numbers are : " + int1 +  " " + int2 + " " + int3);
		System.out.println("The smallest number is: " + smallestInt);
		System.out.println("The largest number is: " + largestInt);
	}
	
}