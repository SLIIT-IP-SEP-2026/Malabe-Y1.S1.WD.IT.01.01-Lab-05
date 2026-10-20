import java.util.Scanner;

public class IT26101227Lab5Q2{
	
	public static void main(String[] args){
		
	int newMembers;
 
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of new members introduced: ");
	newMembers = input.nextInt();
	
	if (newMembers < 0){
		System.out.println("Error: Input must be a number 0 or greater");
		return;
	}
	
	if (newMembers >= 5){
		System.out.println();
		System.out.println("Prize is Headphone");
	}
	
	else if (newMembers >= 4){
		System.out.println();
		System.out.println("Prize is Travelling Chair");
	}
	
	else if (newMembers >= 3){
		System.out.println();
		System.out.println("Prize is Bag");
	}
	
	else if (newMembers >= 2){
		System.out.println();
		System.out.println("Prize is Umbrella");
	}
	
	else if (newMembers >= 1){
		System.out.println();
		System.out.println("Prize is Pen");
	}
	
	else {
		System.out.println();
		System.out.println("No Prize");
	}
  }
}