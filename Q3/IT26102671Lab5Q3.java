import java.util.Scanner;

public class IT26102671Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.1;
        final double DISCOUNT_20 = 0.2;

        int startDate, endDate, days;
        double totalAmount, discountRate = 0.0;

        // Input dates
        System.out.print("Enter start date: ");
        startDate = input.nextInt();

        System.out.print("Enter end date: ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        // Calculate number of days reserved
        days = endDate - startDate;

        // Calculate discount rate
        if (days >= 5) {
            discountRate = DISCOUNT_20;
        } else if (days >= 3) {
            discountRate = DISCOUNT_10;
        }

        // Calculate total amount
        totalAmount = days * ROOM_CHARGE;
        totalAmount = totalAmount - (totalAmount * discountRate);

        // Display results
        System.out.println("Number of days reserved: " + days);
        System.out.printf("Discount rate: %.0f%%%n", discountRate * 100);
        System.out.printf("Total amount to be paid: Rs. %.2f%n", totalAmount);

        input.close();
    }
}
