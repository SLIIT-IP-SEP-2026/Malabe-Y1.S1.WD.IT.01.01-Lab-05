import java.util.Scanner;
   public class IT26102388Lab5Q1
 {
    public static void main(String[] args) {
	
	     int numberone , numbertwo , numberThree , smallest , largest ;
	 
	    Scanner input = new Scanner(System.in) ;
        
		System.out.print("Enter the first integer: ");
		numberone = input.nextInt(); 
		
		System.out.print("Enter the second integer: ");
		numbertwo = input.nextInt();
		
		System.out.print("Enter the third integer: ") ;
		numberThree = input.nextInt();
		
		smallest = numberone;
		largest = numberone; 
		
		if (numbertwo < smallest) {
		   smallest = numbertwo;
		}
		
		if (numbertwo > largest) { 
		   largest = numbertwo; 
		}
		
		if (numberThree < smallest) { 
		    largest = numberThree;
		}

		System.out.println();
		System.out.println("user entered numbers are : " + numberone + " " + numbertwo + " " + numberThree );
		System.out.println("The smallest number is: " + smallest);
		System.out.println("The Largest number  is: " + largest);
	}		
		
}		
