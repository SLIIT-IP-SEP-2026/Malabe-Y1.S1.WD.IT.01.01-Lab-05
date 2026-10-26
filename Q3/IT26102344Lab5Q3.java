import java.util.Scanner;
	public class IT26102344Lab5Q3{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			int oneDay=48000;
			int startDate,endDate,totalDate,totalAmount;
			
			System.out.print("enter start date(1-31)");
			startDate=input.nextInt();
			
			System.out.print("enter end date(1-31)");
			endDate=input.nextInt();
			
			if(startDate>endDate){
				System.out.print("start date must be less than end date");
				return;
			}
			
			else if(startDate<0 || startDate>31 || endDate<0 || endDate>31){
			System.out.print("error: days must be between 1 and 31");	
			return;
			}
			
			else{
				totalDate=endDate-startDate;
				
			}
			
			if(totalDate>=5){
				totalAmount=oneDay*totalDate/100*80;
			}
			else if(totalDate>=3){
				totalAmount=oneDay*totalDate/100*90;
			}
			else{
				totalAmount=oneDay*totalDate;
			}
		System.out.println("room charge per day:rs. "+oneDay);	
		System.out.println("number of days reserved: "+totalDate);		
		System.out.println("total amount to be paid: "+totalAmount);		
			
}
	}