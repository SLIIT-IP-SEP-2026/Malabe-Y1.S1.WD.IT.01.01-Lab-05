
import java.util.Scanner;

public class IT26100133Lab5Q3
{
    public static void main(String[] args)
    {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 0.1;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

        int startDate, endDate, numberofDaysReserved;
        double totalAmountBeforeDiscount, discountAmount;
        double totalAmountToPaid;

        double discountrate = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31)
        {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (endDate <= startDate)
        {
            System.out.println("Error: End date must be after start date");
            return;
        }

        numberofDaysReserved = endDate - startDate;

        if (numberofDaysReserved >= 3 &&
            numberofDaysReserved <= 4)
        {
            discountrate = DISCOUNT_3_TO_4_DAYS;
        }
        else if (numberofDaysReserved >= 5)
        {
            discountrate = DISCOUNT_5_OR_MORE_DAYS;
        }

        totalAmountBeforeDiscount =
            numberofDaysReserved * ROOM_CHARGE_PER_DAY;

        discountAmount =
            totalAmountBeforeDiscount * discountrate;

        totalAmountToPaid =
            totalAmountBeforeDiscount - discountAmount;

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " +
                           ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " +
                           numberofDaysReserved);
        System.out.println("Total Amount Before Discount: Rs. " +
                           totalAmountBeforeDiscount);
        System.out.println("Discount Amount: Rs. " +
                           discountAmount);
        System.out.println("Total Amount to be Paid: Rs. " +
                           totalAmountToPaid);

        input.close();
    }
}
