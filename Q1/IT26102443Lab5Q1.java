import java.util.Scanner;

public class IT26102443Lab5Q1 {
	
	public static void main(String[] args) {
	
	int number1 , number2 , number3 ,largest , smallest;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number1:");
	number1 = input.nextInt();
	
	System.out.print("Enter a number2:");
	number2 = input.nextInt();
	
	System.out.print("Enter a number3:");
	number3 = input.nextInt();
	
	largest = number1;
	smallest = number2;
	
		if (number2 > largest){
		largest = number2;
		}
		if (number2 < smallest){
		smallest = number2;
		}
		
		if (number3 > largest){
		largest = number3;
		}
		if (number3 < smallest){
		smallest = number3;
		}
		
		System.out.println();
		System.out.println("User enter number are:"+number1+" "+number2+" "+number3+" ");
		System.out.println("The smallest number is:"+smallest);
		System.out.println("The largest number is:"+largest);
	}
}