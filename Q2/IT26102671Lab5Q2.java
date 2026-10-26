import java.util.Scanner;

public class IT26102671Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


	    System.out.print("Enter the number of new members: ");
        int NumberOfMembersIntroduced = input.nextInt();
		
		switch (NumberOfMembersIntroduced){
			case 0:
			  System.out.println("NoPrize");
			  break;
			
            case 1:
			  System.out.println("Pen");
			  break;
			  
			case 2:
			  System.out.println("Umbrella");
			  break;

            case 3:
			  System.out.println("Bag");
			  break;

			case 4:
			  System.out.println("Travelling chair");
			  break;

			default:
			  if (NumberOfMembersIntroduced >=5){
			  System.out.println("Prize is a:Headphone");
			  }else{
				  System.out.println("Input must be greater than 0");
			  }
		}
	}		  
}             			
			
		
		
		
		
	