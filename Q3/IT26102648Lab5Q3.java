import java.util.Scanner;

public class IT26102648Lab5Q3{	
	public static void main(String[]args){
		final double PER_DAY_CHARGE = 48000.00; 
		int startDate,endDate,reservedDays;
		double charges, discount, totalAmount;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		reservedDays = endDate-startDate;
		
		if((startDate < 0 || startDate > 31)||(endDate <0 || endDate >31)){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if(startDate>endDate){
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
		if (reservedDays < 3 ){
			discount = 0;
		}else if (reservedDays <= 4){
			discount = 0.1;
		}else {
			discount = 0.2;
		}
		
		charges = reservedDays*PER_DAY_CHARGE;
		totalAmount = charges*(1-discount);
		
		System.out.print("\n");
		System.out.println("Room Charge Per Day: Rs. " + PER_DAY_CHARGE +"/=");
		System.out.println("Number of Days Reserved: " + reservedDays);
		System.out.println("Total Amonunt to be Paid " + totalAmount);
	}
}