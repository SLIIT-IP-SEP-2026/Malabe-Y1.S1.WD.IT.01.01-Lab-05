import java.util.Scanner;
	public class IT26102552Lab5Q3{
		public static void main(String[] args){
			
			final double roomChargePerDay = 48000.00;
			int startDate,endDate,numberOfDaysReserved;
			double discountRate, totalAmount;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the start date(1-31):");
			startDate = input.nextInt();
			
			System.out.print("Enter the end date(1-31):");
			endDate = input.nextInt();
			
			if(startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
				System.out.println("Error: Days must be between 1 and 31");
				
			return;
			}
			
			if (startDate >= endDate ){
				System.out.println("Error: Start Date must be less than End Date");
			return;
			}
			
			numberOfDaysReserved = endDate - startDate;
			
			if(numberOfDaysReserved < 3){
				discountRate = 0;
			}
			
			else if(numberOfDaysReserved <= 4){
				discountRate = 0.10;
			}
			else{
				discountRate = 0.20;
			}
			
			totalAmount = numberOfDaysReserved * roomChargePerDay;
			totalAmount = totalAmount - (totalAmount * discountRate);
			
			System.out.println();
			System.out.println("Room Charge Per Day: Rs. " + roomChargePerDay);
			System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
			System.out.println("Total Amount to be Paid: " + totalAmount);
			
		}
	}