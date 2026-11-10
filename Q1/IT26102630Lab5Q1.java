import java.util.Scanner;

public class IT26102630Lab5Q1 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read three integers from the keyboard
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        // Print the user entered numbers
        System.out.println("User entered numbers are: " + num1 + " " + num2 + " " + num3);

        // Find smallest number
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Find largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Output results
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
	}
}