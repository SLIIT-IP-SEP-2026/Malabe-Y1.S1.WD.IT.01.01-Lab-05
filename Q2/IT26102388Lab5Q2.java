import java.util.Scanner;

   public class IT26102388Lab5Q2 {
        public static void main(String[] args){
	   
	   Scanner input = new Scanner(System.in) ;
	   
	   System.out.print("Enter the number of new members introduced:");
	   int number = input.nextInt();
	   
	   if (number < 0) {
		   System.out.print("Input must be a number 0 or greater");
	   } else if (number == 0) {
			System.out.print("No Prize");
		} else if(number == 1)	{
			System.out.print("Pen");
		} else if (number == 2) {
			System.out.print("Umbrella");
		} else if (number == 3) {
			System.out.print("Bag");
		}	else if (number == 4) {
			System.out.print("Travelling Chair");
		} else  {
            System.out.print("Headphone");
		}
		
		input.close();
	    }
			
    }
	
				
		
		
			
	   