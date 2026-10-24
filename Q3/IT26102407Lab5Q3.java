import java.util.Scanner;
public class IT26102407Lab5Q3{

    public static void main(String[]args){

        Scanner input = new Scanner (System.in);

        final double RoomChargePerDay = 48000;
        final double Discount_3_to_4_days = 0.1;
        final double Discount_5_or_more_days = 0.2;

        int startingDate , endingDate ,numberOfDatesReserved;
        double totalAmountBeforeDiscount , discount , finalAmount;
        double discountRate = 0;

        System.out.print("Enter Start Date (1-31): ");
        startingDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endingDate = input.nextInt();

        if(startingDate < 1 || startingDate > 31 || endingDate < 1 || endingDate >31)
        {
            System.out.print("Days must be between 1 and 31");
            return ;
        }

        if (startingDate >= endingDate)
        {
            System.out.print("Start Date must be less than End Date");
            return;    
        }

        numberOfDatesReserved = endingDate - startingDate;
        
        if (numberOfDatesReserved >= 3 && numberOfDatesReserved <= 4)
        {
            discountRate = Discount_3_to_4_days;
        }
        else if (numberOfDatesReserved >= 5)
        {
            discountRate = Discount_5_or_more_days;
        }

        totalAmountBeforeDiscount = RoomChargePerDay * numberOfDatesReserved;
        discount = totalAmountBeforeDiscount * discountRate;
        finalAmount = totalAmountBeforeDiscount - discount;

        System.out.println(" ");
        System.out.println("Room Charge Per Day: Rs. " + RoomChargePerDay);
        System.out.println("Number of Days Reserved: " + numberOfDatesReserved);
        System.out.println("Total Amount to be Paid: " + finalAmount);

    }

}
