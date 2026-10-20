import java.util.Scanner;

public class IT26101970Lab5Q3 {

    public static void main(String[] args) {

        // Declaring the constants
        final double roomChargePerDay = 48000.00;
        final double discount_3_to_4_days = 0.1;
        final double discount_5_or_more_days = 0.2;

        // Declaring variables
        int startDate, endDate, daysReserved;
        double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;

        double discountRate = 0;

        // Creating the Scanner input
        Scanner input = new Scanner(System.in);

        // Getting the dates from user
        System.out.print("Enter Start Date (1 -31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1 -31): ");
        endDate = input.nextInt();

        // Validating the dates
        if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if(startDate >= endDate){
            System.out.println("Error: Start date must be less than End date");
            return;
        }

        // Calculating the number of days
        daysReserved = endDate - startDate;

        // Checking if reservations are eligible for discount
        if(daysReserved >= 3 && daysReserved <= 4){
            discountRate = discount_3_to_4_days;
        } else if (daysReserved >= 5) {
            discountRate = discount_5_or_more_days;
        }

        // Calculating the total amount to be paid
        totalAmountBeforeDiscount = daysReserved * roomChargePerDay;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

        // Output the results
        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + roomChargePerDay + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved );
        System.out.println("Total Amount to be Paid: " + totalAmountToBePaid);
    }
}
