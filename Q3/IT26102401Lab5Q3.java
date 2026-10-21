import java.util.Scanner;

public class IT26102401Lab5Q3 {
    public static final double CHARGE = 48000.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int start = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int end = sc.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        } else if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
        } else {
            int days = end - start;
            double discount = 0;

            if (days >= 3 && days <= 4) {
                discount = 10;
            } else if (days >= 5) {
                discount = 20;
            }

            double total = days * CHARGE;
            total = total - (total * discount / 100);

            System.out.println("Room Charge Per Day: Rs. " + CHARGE);
            System.out.println("Number of Days Reserved: " + days);
            System.out.println("Total Amount to be Paid: " + total);
        }

       
    }
}