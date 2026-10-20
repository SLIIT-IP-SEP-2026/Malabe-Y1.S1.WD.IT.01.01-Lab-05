import java.util.Scanner;

public class IT26102396Lab5Q2 {
    public static void main(String[] args) {
		
		int members , choice;
		
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        members = input.nextInt();

        if (members < 0) {
            System.out.println("Input must be a number 0 or greater");
            return;
        }

		if (members >= 5) {
		choice = 5;
		} else {
		choice = members;
		}

        System.out.println();

        switch ( choice ) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Prize is a : Pen");
                break;
            case 2:
                System.out.println("Prize is a : Umbrella");
                break;
            case 3:
                System.out.println("Prize is a : Bag");
                break;
            case 4:
                System.out.println("Prize is a : Travelling Chair");
                break;
            case 5:
                System.out.println("Prize is a : Headphone");
                break;
        }
    }
}