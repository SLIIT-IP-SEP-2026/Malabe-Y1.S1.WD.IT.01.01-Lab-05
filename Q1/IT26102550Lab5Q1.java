import java.util.Scanner;
public class IT26102550Lab5Q1  {
	public static void main(String[] args) { 
	
	//declare the variables
	int numberOne , numberTwo ,  numberThree , smallest , largest;
	
	//Create a Scanner object to read input
	Scanner input = new Scanner(System.in);

	//prompt user to enter three integers
	System.out.print("Enter the first integer:");
	numberOne = input.nextInt();

	System.out.print("Enter the second integer:");
	numberTwo = input.nextInt();

	System.out.print("Enter the third integer:");
	numberThree = input.nextInt();
	
	// Assign smallest and largest to 'numberOne' initially
	smallest = numberOne;
	largest = numberOne;
	
	//Compare 'numberTwo' with smallest and largest
	if (numberTwo < smallest) {
	    smallest = numberTwo;
	
	}
	if (numberTwo > largest) {
	    largest = numberTwo;
	}
	
	// Display the results
	System.out.println();
	System.out.println("User entered numbers are: " + numberOne + " " + numberThree);
	System.out.println("The smallest number is: " + smallest);
	System.out.println("The largest number is: " + largest);
	}
}

