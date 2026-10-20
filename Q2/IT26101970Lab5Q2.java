import java.util.Scanner;

public class IT26101970Lab5Q2 {

    public static void main(String[] args) {

        // Declaring the variables
        int numberOfMembersIntroduced;

        // Create a new scanner input
        Scanner input = new Scanner (System.in);

        // Getting the input from the user
        System.out.print("Enter the number of new members introduced: ");
        numberOfMembersIntroduced = input.nextInt();

        // Sorting out the gifts to the users
        switch (numberOfMembersIntroduced){
            case 0:
                System.out.println("No Prize");
                break;

            case 1:
                System.out.println("Prize is a: Pen");
                break;

            case 2:
                System.out.println("Prize is a: Umbrella");
                break;

            case 3:
                System.out.println("Prize is a: Bag");
                break;

            case 4:
                System.out.println("Prize is a: Travelling Chair");
                break;

            default:
                if (numberOfMembersIntroduced >= 5){
                    System.out.println("Prize is a: Headphone");
                } else{
                    System.out.println("Input must be a number 0 or greater");
                }
        }
    }
}
