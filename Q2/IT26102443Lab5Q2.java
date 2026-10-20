import java.util.Scanner;

public class IT26102443Lab5Q2 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of members: ");
		int numberOfMembers = input.nextInt();
		
		if (numberOfMembers >= 5) {
			System.out.println("Headphone");
		}
		
		else if (numberOfMembers == 4) {
			System.out.println("Travelling Chair");
		}
		
		else if (numberOfMembers == 3) {
			System.out.println("Bag");
		}
		
		else if (numberOfMembers == 2) {
			System.out.println("Umbrella");
		}
		
		else if (numberOfMembers == 1) {
			System.out.println("Pen");
		}
		
		else{
			System.out.println("No prize");
		}
	}
}