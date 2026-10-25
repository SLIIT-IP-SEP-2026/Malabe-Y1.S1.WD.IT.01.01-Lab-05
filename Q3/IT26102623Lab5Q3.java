
import java.util.Scanner;
public class IT26102623Lab5Q3
{
		public static final double rent_per_day= 48000;
		public static void main(String[]args)
		{
			Scanner input =new Scanner(System.in);
			
			
			System.out.println("Enter start date: ");
			int start_date = input.nextInt();

			
			if (1> start_date || start_date>30)
			{
				System.out.println("Ivalid date");
			}
		
			System.out.println("Enter end date: ");
			int end_date=input.nextInt(); ;
			
			if (1 > end_date || end_date > 30)
			{
				System.out.println("Ivalid date");
			}
			
			if (start_date > end_date)
			{
				System.out.println("Ivalid date");
			}
			
			int no_of_days_reserved;
			no_of_days_reserved = end_date - start_date;
			
			double total_Amount_to_pay, dis, Totalamount;
			Totalamount= no_of_days_reserved*rent_per_day;
			
			if (no_of_days_reserved >= 5)
			{
				System.out.println("Your discount rate is 20%");
				dis = (Totalamount) *20/100;
				total_Amount_to_pay = Totalamount-dis;
				System.out.println("Please pay " + total_Amount_to_pay);
				
			}
									
			if (3 <= no_of_days_reserved && no_of_days_reserved <= 4)

			{
				System.out.println("Your discount rate is 10%");
				dis = (Totalamount) *10/100;
				total_Amount_to_pay = Totalamount-dis;
				System.out.println("Please pay " + total_Amount_to_pay);
			}
			
			else
			{
				System.out.println("you have no discount");
				System.out.println("Please pay " + Totalamount);
			}
		}
}