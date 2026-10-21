import java.util.Scanner;

public class IT26102095Lab5Q1 {
    public static void main(String[] args) {
        
        int first, second, third, smallest, largest; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        first = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        second = input.nextInt(); 
        
        System.out.print("Enter the third integer: ");
        third = input.nextInt(); 
        
        
        smallest = first;
        largest = first;
        
       
        if (second < smallest) {
            smallest = second;
        }
        if (second > largest) {
            largest = second;
        }
        if (third < smallest) {
            smallest = third;
        }
        if (third > largest) {
            largest = third;
        }
        
        
        System.out.println("User entered numbers are: " + first + " " + second + " " + third);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
        input.close(); 
    }
}