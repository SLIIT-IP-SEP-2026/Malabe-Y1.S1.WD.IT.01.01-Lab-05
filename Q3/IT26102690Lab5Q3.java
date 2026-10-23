import java.util.Scanner ;
public class IT26102690Lab5Q3 {
	public static void main(String[] args){
		double startDay , endDay , totaldays , Price , DiscountedTotal ;
		final double Dayprice = 48000.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Start Date (1-31)");
		startDay = input.nextInt();
		
		System.out.println("Enter End Date (1-31)");
		endDay = input.nextInt();
		
		if ((startDay < 1 || startDay > 31) || (endDay < 1 || endDay > 31)){
			System.out.println("Days must be between 1-31");
			
		}else if (startDay > endDay){
			System.out.println("Start day should be less than end day");
			
		}else {
			
			totaldays = endDay - startDay;
			if (totaldays == 3 || totaldays == 4){
				
				Price = Dayprice * totaldays;
				DiscountedTotal = Price * 90/100;
				System.out.println("Room Charge per Day : RS " + Dayprice);
				System.out.println("Number of Days Reserved :" + totaldays);
				System.out.println("Total Amount To Be Paid RS :" + DiscountedTotal);
				
			}else if (totaldays >= 5){
				
				Price = Dayprice * totaldays;
				DiscountedTotal = Price * 80/100;
				System.out.println("Room Charge per Day : RS " + Dayprice);
				System.out.println("Number of Days Reserved :" + totaldays);
				System.out.println("Total Amount To Be Paid RS :" + DiscountedTotal);
				
				
				
			}else {
				
				Price = Dayprice * totaldays;
				System.out.println("Room Charge per Day : RS " + Dayprice);
				System.out.println("Number of Days Reserved :" + totaldays);
				System.out.println("Total Amount To Be Paid RS :" + Price);
			}
			
			
		}
		
	}
	
}