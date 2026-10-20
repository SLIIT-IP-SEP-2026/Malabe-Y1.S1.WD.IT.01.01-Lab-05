import java.util.Scanner;

public class IT26102443Lab5Q3 {
	
	public static void main(String[] args) {
	
		int startDate,endDate,daysBooked;
		double totalAmountToPay ,totalAmountBeforeDiscount , discountAmount;		
		
		final  double CHARGE_PER_DAY = 48000.00;
		final double DISCOUNT_3_TO_4_DAYS = 0.1;
		final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		double discountRate = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Start Date(1-31):");
		startDate = input.nextInt();
		
		System.out.println("Enter Start Date(1-31):");
		endDate = input.nextInt();
		
		if ( startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
			System.out.println("Error: Days must between 1 and 31");
		return;	
		}
		if ( startDate >= endDate){
			System.out.println("Error: Start Date must be less than End Date");
		return;	
		}	
		
		daysBooked = endDate-startDate;
		
		if(daysBooked>3&&daysBooked<4){
			discountRate = DISCOUNT_3_TO_4_DAYS;
		}
		
		else if (daysBooked>=5){
			discountRate = DISCOUNT_5_OR_MORE_DAYS;
		}
		
		totalAmountBeforeDiscount = CHARGE_PER_DAY*daysBooked;
		discountAmount = totalAmountBeforeDiscount*discountRate;
		totalAmountToPay = totalAmountBeforeDiscount-discountAmount;
		
		System.out.println();
		System.out.println("Room Charge Per Day:" +CHARGE_PER_DAY);
		System.out.println("Number of Days Reserved:" +daysBooked);
		System.out.println("Total Amount to be Paid:" +totalAmountToPay);
	}
}	
		