import java.util.Scanner;

public class IT26102738Lab5Q3{
	public static void main(String []args){
		
		Scanner input=new Scanner(System.in);
		
		final double room_charge = 48000.00;
		final double 10_discount = 0.1;
        final double 20_discount = 0.2;
		
		int st_date,en_date,numberOfDaysReserved;
		double totalAmountBeforeDiscount,discountAmount,totalAmountToBePaid;
		double discountRate=0;
		
		System.out.print("Enter Start Date(1-31): ");
		st_date=input.nextInt();
		
		System.out.print("Enter End Date(1-31): ");
		en_date=input.nextInt();
		
		if(st_date < 1 || st_date > 31 || en_date < 1 || en_date > 31){
			System.out.print("Error:Days must be between 1 and 31");
			return;
		}
		
		if(st_date>=en_date){
			System.out.Print("Error:Start date must be less than End date");
			return;
		}
		
		numberOfDaysReserved=en_date-st_date;
		
		if(numberOfDaysReserved>=3 && numberOfDaysReserved<=4){
			discountRate=10_discount;
		}
		else if (numberOfDaysReserved>=5){
			discountRate=20_discount;
		}
		
		totalAmountBeforeDiscount=numberOfDaysReserved*room_charge;
		discountAmount=totalAmountBeforeDiscount*discountRate;
		totalAmountToBePaid=totalAmountBeforeDiscount-discountAmount;
		
		System.out.println();
		System.out.println("Room charge Per Day:Rs."+room_charge+"/=");
		System.out.println("Number of days Reserved:"+numberOfDaysReserved);
		System.out.println("Total Amount to be Paid:"+totalAmountToBePaid);
	}
}