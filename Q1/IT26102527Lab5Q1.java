import java.util.Scanner;
public class IT26102527Lab5Q1{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2,num3;
		int smallestNum, largestNum;
		
		System.out.println("Enter the first integer: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second integer: ");
		num2 = sc.nextInt();
		
		System.out.println("Enter the third integer: ");
		num3 = sc.nextInt();
		
		smallestNum = num1;
		largestNum = num1;
		
		if (smallestNum > num2 ) {
			smallestNum = num2;
		}
		if (num2 > largestNum) {
			largestNum = num2;
		}
		
		if (smallestNum > num3 ) {
			smallestNum = num3;
		}
		if (num3 > largestNum) {
			largestNum = num3;
		}
		
		System.out.println();
		System.out.println("The entered numbers are: " + num1 + " "+ num2 + " " + num3);
		System.out.println("The smallest number is: " + smallestNum);
		System.out.println("The Largest number is: "+ largestNum);
		
	}
}