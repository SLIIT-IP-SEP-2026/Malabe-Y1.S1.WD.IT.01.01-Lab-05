import java.util.Scanner;
public class IT26102552Lab5Q1{
	public static void main(String[] args){
		
		int firstInteger, secondInteger, thirdInteger, smallestNumber, largestNumber  ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer:");
		firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer:");
		secondInteger = input.nextInt();
		
		System.out.print("Enter the third integer:");
		thirdInteger = input.nextInt();
		
		smallestNumber = firstInteger;
		
		if (firstInteger > secondInteger){
			smallestNumber = secondInteger;
		}
		
		
		if ( firstInteger > thirdInteger){
			smallestNumber = thirdInteger;
		}
		
		largestNumber = firstInteger;
		
		if( firstInteger < secondInteger){
			
			largestNumber = secondInteger ;
		
		}
		
		if( firstInteger < thirdInteger){
			
			largestNumber = thirdInteger;
			
		}	
		System.out.println();
		System.out.println("User entered numbers are:"  + firstInteger + " " + secondInteger + " " + thirdInteger);
		
		System.out.println("The Smallest number is: " + smallestNumber);
        System.out.println("The Largest number is: " + largestNumber);	
			
			
			
			
			
			
		
	
		}
}