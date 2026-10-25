
import java.util.Scanner;

public class IT26102475Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        int startDate, endDate, days;
        double discountRate, totalAmount;

        System.out.print("Enter start date: ");
        startDate = input.nextInt();

        System.out.print("Enter end date: ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {
            System.out.println("Invalid date");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Start date should be less than end date");
            input.close();
            return;
        }

        days = endDate - startDate;

        if (days < 3) {
            discountRate = 0;
        } else if (days <= 4) {
            discountRate = 10;
        } else {
            discountRate = 20;
        }

        totalAmount = days * ROOM_CHARGE;
        totalAmount = totalAmount -
                      (totalAmount * discountRate / 100);

        System.out.println("Number of days reserved: " + days);
        System.out.println("Total amount to be paid: Rs. "
                           + totalAmount);

        input.close();
    }
}
