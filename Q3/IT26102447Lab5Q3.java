import java.util.Scanner;

public class IT26102447Lab5Q3 {
	public static void main(String[] args) {
		
		final double ROOM_CHARGE_PER_DAY = 48000.00;
		final double DISCOUNT_3_TO_4_DAYS = 0.1;
		final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		
		int startDate , endDate , numberOfDaysReserved;
		double totalAmountBeforeDiscounnt , discountAmount , totalAmountToBePaid;

			double discountRate = 0;
			
			Scanner input =  new Scanner(System.in);
			
			System.out.print("Enter start Date (1 - 31): ");
			startDate = input.nextInt();
			
			System.out.print("Enter the end Date (1 - 31): ");
			endDate = input.nextInt();
			
			if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
				System.out.print("Error: Days must be between 1 and 31");
				return;
			}
			
			if (startDate >= endDate){
				System.out.print("Error: Start date must be less than End date");
				return;
			}
			
			numberOfDaysReserved = endDate - startDate;
			
			if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
				discountRate = DISCOUNT_3_TO_4_DAYS;
			}
			
			else if (numberOfDaysReserved >= 5) {
				discountRate = DISCOUNT_5_OR_MORE_DAYS;
			}
				
				
			totalAmountBeforeDiscounnt = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
			discountAmount = totalAmountBeforeDiscounnt *discountRate;
			totalAmountToBePaid = totalAmountBeforeDiscounnt - discountAmount;
			
			System.out.println();
			System.out.println("Room charge per day: Rs. " + ROOM_CHARGE_PER_DAY +"/=");
			System.out.println("Number of days reserved: " + numberOfDaysReserved);
			System.out.println("Total amount to be paid: " + totalAmountToBePaid);
			
	}
}
				
			
			
			