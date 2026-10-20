import java.util.Scanner;

public class IT26102353Lab5Q3 {

    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final double DISCOUNT_10_PERCENT = 0.10;
    static final double DISCOUNT_20_PERCENT = 0.20;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31
                || endDate < 1 || endDate > 31) {

            System.out.println(
                    "Error: Days must be between 1 and 31");

            return;
        }

        if (startDate >= endDate) {

            System.out.println(
                    "Error: Start Date must be less than End Date");

            return;
        }

        int daysReserved = endDate - startDate;

        double discountRate;

        if (daysReserved < 3) {
            discountRate = 0.0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10_PERCENT;
        } else {
            discountRate = DISCOUNT_20_PERCENT;
        }

        double totalBeforeDiscount =
                daysReserved * ROOM_CHARGE_PER_DAY;

        double discountAmount =
                totalBeforeDiscount * discountRate;

        double totalAmount =
                totalBeforeDiscount - discountAmount;

        System.out.println(
                "\nRoom Charge Per Day: Rs. "
                        + ROOM_CHARGE_PER_DAY + "/=");

        System.out.println(
                "Number of Days Reserved: " + daysReserved);

        System.out.println(
                "Total Amount to be Paid: " + totalAmount);
    }
}