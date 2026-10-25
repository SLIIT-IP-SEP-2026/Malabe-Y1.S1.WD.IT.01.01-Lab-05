import java.util.Scanner;

public class IT26102367Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int startdate,enddate,bookdays;
		double perday,totalamount,finalamount,discount;
		
		perday=48000;
		
		System.out.println("Enter Start date");
		startdate =input.nextInt();
		
		System.out.println("Enter end date");
		enddate =input.nextInt();
		
		
		if(startdate>enddate){
			System.out.println("Start date must be less than end date");
			return;
		}if(startdate<1 || enddate>31 || startdate>31 || enddate<1 ){
			System.out.println("Days must be between 1 and 31");
			return;
		}
		bookdays=enddate-startdate;
		if(bookdays<3){
			discount=0;
		}else if(bookdays<=4){
			discount=10;
		}else{
			discount=20;
		}
		totalamount=bookdays*perday;
		discount=totalamount*discount/100;
		finalamount=totalamount-discount;
		
		System.out.println("Room Charge Per Day: "+perday);
		System.out.println("Number of days reserved: "+bookdays);
		System.out.println("Total amount to be Paid: "+ finalamount);
	}
}