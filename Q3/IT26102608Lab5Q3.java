import java.util.Scanner;

public class IT26102608Lab5Q3{
	
	public static final double perDayCharge = 48000;
	public static final int discount1 = 10;
	public static final int discount2 = 20;
		
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		
		int appliedDiscount = 0;
		
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31 ){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if (startDate > endDate) {
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
		int noOfDays = endDate - startDate;
		
		if (noOfDays < 3){
			appliedDiscount = 0;
		}
		else if (noOfDays >= 3 && noOfDays <= 4){
			appliedDiscount = discount1;
		}
		else if (noOfDays > 4){
			appliedDiscount = discount2;
		}
		
		double totalAmount = noOfDays*perDayCharge*(100 - appliedDiscount)/100;
		
		System.out.println();
		System.out.println("Room Charge Per Day: Rs." + perDayCharge + "/=");
		System.out.println("Number of Days Reserved: " + noOfDays);
		System.out.println("Total Amount to be Paid: " + totalAmount);
		
	}
	
}
