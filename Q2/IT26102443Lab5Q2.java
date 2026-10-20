import java.util.Scanner;

public class IT26102443Lab5Q2 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of members:");
		int numberofmembers = input.nextInt();
		
		if(numberofmembers >= 5){
		System.out.println("Headphone");
		}
		else if(numberofmembers == 4){
		System.out.println("Traveling Chair");
		}
		else if(numberofmembers == 3){
		System.out.println("Bag");
		}
		else if(numberofmembers == 2){
		System.out.println("Umbrella");
		}
		else if(numberofmembers == 1){
		System.out.println("Pen");
		}
		else{
		System.out.println("No Prize");
	}
	}
}	
		