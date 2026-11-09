import java.util.Scanner;
  public class ResortReservation {
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int MIN_DATE = 1;
    private static final int MAX_DATE = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return; 
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; 
        }

        int daysReserved = endDate - startDate;

        double discountRate = 0.0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10.0;
        } else if (daysReserved >= 5) {
            discountRate = 20.0;
        }

        double baseAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = baseAmount * (discountRate / 100.0);
        double totalAmountPaid = baseAmount - discountAmount;

        System.out.println("");
        System.out.println("Number of days reserved: " + daysReserved + " days");
        System.out.printf("Discount Applied:", discountRate);
        System.out.printf("Total amount to be paid:", totalAmountPaid);

        scanner.close();
    }
}