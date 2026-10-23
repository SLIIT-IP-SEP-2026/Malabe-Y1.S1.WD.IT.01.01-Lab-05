import java.util.Scanner;

public class IT26102527Lab5Q3{
	public static void main (sting[] args){
		final double ROOM_CHARGE_PER_DAY = 48000.00;
		final double DISCOUNT_FOR_3_OR_4_DAYS = 0.1;
		final double DISCOUNT_FOR_5_OR_MORE_DAYS = 0.2;
		
		
		
		double discountRate;
		scanner sc = new Sacnner(System.in);
		
		System.out.println("Enter Start Date(1 - 31): ");
		startDate = sc.nextInt();
		
		System.out.println("Enter End Date(1 - 31): ");
		endDate = sc.nextInt();
		
		if (startDate < 1 ||endDate < 1 || startDate > 31 ||endDate > 31 ) {
			System.out.println("noOfDays must be between 1 and 31");
		}
		if (startDate > endDate){
			System.out.println("Error: Start Date must be less than End Date");
		}
			
		noOfDays  = endDate - startDate;
		
		if (noOfnoOfDays < 3){
			discountRate = 0;

		if (noOfDays = 3 || noOfDays = 4 ){
			discountRate = DISCOUNT_FOR_3_OR_4_DAYS;
		}
		if (noOfDays >= 5){
			discountRate = DISCOUNT_FOR_5_OR_MORE_DAYS;
		}
			
			
		double amount = ROOM_CHARGE_PER_DAY * noOfDays;
		discount = amount * discountRate;
		finalAmount = amount - discount;
		
		system.out.orintln();
		System.out.println("Room Charge Per Day: " + ROOM_CHARGE_PER_DAY);
		System.out.println("Number of noOfDays Reserved: " + noOfDays);
		System.out.println("Total Amount to be Paid: " + finalAmount);
		}
	}