import java.util.Scanner;

public class IT26102590Lab5Q2 {

    public static void main(String[] args) {
		
        
		
		
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter No of Members: ");
		
        int memberCount = input.nextInt();
		if(memberCount<0){
			System.out.println("Error:Number should be greater or equal to zero");
			return;
		}

        if (memberCount>=5){
			System.out.println("You obtained a Headphone");
		}
		else { switch(memberCount){
			
			
			
			case 4 :
				
				System.out.println("You obtained a Travelling Chair");
				
				break;
			
			case 3 :
				
				System.out.println("You obtained a Bag");
				
				break;
				
				
			case 2 :
				
				System.out.println("You obtained an Umbrella");
				
				break;
			
			case 1 :
				
				System.out.println("You obtained a Pen");
				
				break;
			
			case 0 :
				
				System.out.println("Not obtained anything");
				
				break;
			
			
			default :
			
				System.out.println("Invalid Type Entered");
				
		}
		}
    }
}