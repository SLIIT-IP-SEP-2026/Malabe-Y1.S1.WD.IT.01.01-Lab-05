import java.util.Scanner;

public class IT26102529Lab5Q2{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the no of new members introduced: ");
		int members=input.nextInt();
		
		if(members<0){
			System.out.println("input must be a number 0 or greater");
		}else{
			switch(members){
				case 0:
				System.out.println("Prize: No Prize");
				break;
				
				case 1:
				System.out.println("Prize:Pen");
				break;
				
				case 2:
				System.out.println("Prize:Umbrella");
				break;
				
				case 3:
				System.out.println("Prize: Bag");
				break;
				
				case 4:
				System.out.println("Prize: Travelling Chair");
				break;
				
				default:
				System.out.println("Prize: Headphone");
				break;
			}
			
		}
	}
}