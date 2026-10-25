import java.util.Scanner;
public class IT26102447Lab5Q2 {
	public static void main(String[] args) {
		int newMembers; 
		String prize;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of new mwmbers introduced: ");
		newMembers = input.nextInt();
		
		if (newMembers < 0) {
			System.out.println("Input must be a number 0 or greater");
			}else {
			 switch (newMembers){
				 case 0:
					prize = "No Prize";
					System.out.println(prize);
					break;
				 case 1:
					prize = "Pen";
					System.out.println("Prize is a : " +prize);
					break;
				 case 2:
					prize = "Umbrella";
					System.out.println("Prize is :  " +prize);
					break;
				case 3:
					prize = "Bag";
					System.out.println("Prize is : " +prize);
					break;
				case 4:
					prize = "Travelling Chair";
					System.out.println("Prize is : " + prize);
					break;
					default:
					
					prize = "Headphone";
					System.out.println("Prize is : " +prize);
					break;
			 }
			}
	}
}
				 
		
		
		