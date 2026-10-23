
import java.util.Scanner;

public class IT26102667Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        int startDate, endDate, days;
        double discount, total;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");

        } else if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");

        } else {

            days = endDate - startDate;

            if (days < 3) {
                discount = 0;
            } else if (days <= 4) {
                discount = 10/100;
            } else {
                discount = 20/100;
            }

            total = days * ROOM_CHARGE;
            total = total - (total * discount);

            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE);
            System.out.println("Number of Days Reserved: " + days);
            System.out.println("Total Amount to be Paid: " + total);
        }

       
    }
}
