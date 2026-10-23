import java.util.Scanner;

public class IT26102527Lab5Q2{
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		String prize;
		
		System.out.print("Enter the number of new members introduced: ");
		int number = input.nextInt();
		
		if (number >= 0){
			switch(number)
			{
				case 0 : prize = "No Prize";
				break;
				
				case 1 : prize = "Pen";
				break;
				
				case 2 : prize = "Umbrella";
				break;
				
				case 3 :  prize = "Bag";
				break;
				
				case 4 : prize = "Travelling Chair";
				break;
				
				default : prize = "Headphone";
				
			
			}
			System.out.println("Prize is a : " + prize);
		}
		else{
			System.out.println("Inpt must be a number 0 or greater ");
		}
	}
}