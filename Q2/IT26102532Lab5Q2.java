import java.util.Scanner;
  public class CreditCardPromotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int newMembers = input.nextInt(); 
		
        if (newMembers < 0) {
            System.out.println("Error! Number of members shuld be greater than or equal to 0.");
        } else {
           
            switch (newMembers) {
                case 0:
                    System.out.println("Prize: No Prize");
                    break;
                case 1:
                    System.out.println("Prize: Pen");
                    break;
                case 2:
                    System.out.println("Prize: Umbrella");
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

        input.close();
    }
}