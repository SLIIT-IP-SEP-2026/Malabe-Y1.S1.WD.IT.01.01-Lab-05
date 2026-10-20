import java.util.Scanner;

public class IT26102590Lab5Q3
{

	public static void main(String[] args)
	{	
	
		final double ROOM_CHARGE_PER_DAY = 48000.00;
		final double DISCOUNT_3_TO_4_DAYS = 0.1;
		final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		
		double discountRate=0;
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the Start date:");
		int startDate= input.nextInt();
		System.out.print("Enter the end date:");
		int endDate= input.nextInt();
		
		if ( startDate<1 || startDate>31||endDate<1 || endDate>31)
		{System.out.println ("Error Start date and End date should be between 1-31");
		return;}
		
		
	
		
		if (startDate>=endDate)
		{System.out.println ("Error:Start date must be less than end date");
		return;}
		
		int numberOfDaysReserved= endDate- startDate;
		
		
		if (numberOfDaysReserved>=3 && numberOfDaysReserved<=4)
		{ discountRate= DISCOUNT_3_TO_4_DAYS;}
	
		else if (numberOfDaysReserved>=5)
		{ discountRate= DISCOUNT_5_OR_MORE_DAYS;}
		
		double totalAmountBeforeDiscount= numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
		double discountAmount= totalAmountBeforeDiscount * discountRate;
		double totalAmountAfterDiscount = totalAmountBeforeDiscount- discountAmount;
		
		
		System.out.println( );
		System.out.println( "Room charge per day: Rs." +ROOM_CHARGE_PER_DAY);
		System.out.println("Number of days that reserved:" +numberOfDaysReserved );
		System.out.println("Total amount to be paid:" +totalAmountAfterDiscount);
		
		
		
	}
}