import java.util.Scanner;

public class IT26102024Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.0;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;
        final double DISCOUNT_LOW = 10.0;
        final double DISCOUNT_HIGH = 20.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // validation 1 - both dates must be inside the month
        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");
        }
        // validation 2 - start must come before the end
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        }
        else {
            int days = endDate - startDate;
            double total = days * ROOM_CHARGE;

            // work out the discount
            double discountRate = 0;
            if (days >= 5) {
                discountRate = DISCOUNT_HIGH;
            } else if (days >= 3) {
                discountRate = DISCOUNT_LOW;
            }

            total = total - (total * discountRate / 100);

            System.out.println();
            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
            System.out.println("Number of Days Reserved: " + days);
            System.out.println("Total Amount to be Paid: " + total);
        }
    }
}