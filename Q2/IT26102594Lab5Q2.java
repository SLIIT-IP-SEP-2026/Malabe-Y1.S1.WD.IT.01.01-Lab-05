import java.util.Scanner;

public class IT26102594Lab5Q2{
	
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int invites = input.nextInt();
		
		if (invites < 0){
			System.out.println("Input must be a number 0 or greater");
		}
		
		String prize;
		
		switch(invites) {
			
			case 0:
				System.out.println();
				System.out.println("No Prize");
				return;
			case 1:
				prize = "Pen";
				break;
			case 2:
				prize = "Umbrella";
				break;
			case 3:
				prize = "Bag";
				break;
			case 4:
				prize = "Travelling Chair";
				break;
			default:
				prize = "Headphone";
				break;
		}
			System.out.println();			
			System.out.println("Prize is a : " + prize);
		
	}
	
}