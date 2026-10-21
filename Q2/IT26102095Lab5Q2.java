import java.util.Scanner;

public class IT26102095Lab5Q2{	
	public static void main(String[]args){
		int introducedPeople;
		String prize;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of new members introduced: ");
		introducedPeople = input.nextInt();
		
		System.out.print("\n");
		
		if (introducedPeople<0){
			System.out.print("Input must be a number 0 or greater");
			return;
		}
		if (introducedPeople == 0){
			System.out.println("No Prize");
			return;
		}
		
		switch(introducedPeople){
			case 1 :
					prize = "Pen";
					break;
			case 2 :
					prize = "Umbrella";
					break;
			case 3 :
					prize = "Bag";
					break;
			case 4 :
					prize = "Travelling Chair";
					break;
			default :
					prize = "Headphone";
		}
		
		System.out.println("Prize is a : "+prize);
	}
}