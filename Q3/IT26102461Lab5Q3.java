import java.util.Scanner;

public class IT26102461Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        final double ROOM_CHARGE = 48000.00;
        final int DAYS_IN_MONTH = 31;

        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        
        if (startDate < 1 || startDate > DAYS_IN_MONTH ||
            endDate < 1 || endDate > DAYS_IN_MONTH) {

            System.out.println("Error: Days must be between 1 and 31");
        }

        
        else if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");
        }

        else {

            int daysReserved = endDate - startDate;
            double discountRate;
            double totalAmount;

            
            if (daysReserved < 3) {
                discountRate = 0;
            } 
            else if (daysReserved <= 4) {
                discountRate = 10;
            } 
            else {
                discountRate = 20;
            }

            
            double amount = daysReserved * ROOM_CHARGE;
            totalAmount = amount - (amount * discountRate / 100);

            
            System.out.println();
            System.out.printf("Room Charge Per Day: Rs. %.2f/=%n",
                    ROOM_CHARGE);

            System.out.println("Number of Days Reserved: " + daysReserved);

            System.out.printf("Total Amount to be Paid: Rs. %.2f%n",
                    totalAmount);
        }

        input.close();
    }
}