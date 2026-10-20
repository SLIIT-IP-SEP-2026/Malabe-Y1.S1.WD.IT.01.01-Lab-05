import java.util.Scanner;
public class IT26102417Lab5Q3{
    public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	
	final double room_charge_per_day = 48000;
    final double discount_3_to_4_days = 0.1;
    final double dicount_5_or_more_Days = 0.2;
	
	int startDate , endDate, numberOfDaysReserved;
	
	double toatalAmountBeforeDiscount , dicountAmount , totalAmount ;
	double dicountRate = 0;
	
	System.out.print("Enter the start day(1 - 31):");
	startDate = input.nextInt();
	
	System.out.print("Enter the end date(1 -31): ");
	endDate = input.nextInt();
	
	
	if (startDate < 1 || endDate < 1 || startDate > 31 || endDate > 31  ){
	   System.out.println("Error: Days must bebetween 1 and 31");
	
	
    
	 return ;
	}

     if(startDate <= endDate){
		 System.out.print("Start date must be less than End dare");
	 
		
	 return;
	 }
	 
	 numberOfDaysReserved = endDate - startDate;
	 
	 if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4){
	     dicountRate = discount_3_to_4_days;
	 }
	 
	 else  if(numberOfDaysReserved >= 5){
		 dicountAmount = dicount_5_or_more_Days;
	 }
	 
	 toatalAmountBeforeDiscount = numberOfDaysReserved * room_charge_per_day;
     dicountAmount = numberOfDaysReserved * dicountRate;
     totalAmount = toatalAmountBeforeDiscount - dicountAmount;
 
    
			System.out.println();
	        System.out.println(" Room charge per day : + room_charge_per_day");
	        System.out.println(" number of days reserved: = numberOfDaysReserved");
	        System.out.println("total Amount: " + totalAmount );
	     }
	}
	
