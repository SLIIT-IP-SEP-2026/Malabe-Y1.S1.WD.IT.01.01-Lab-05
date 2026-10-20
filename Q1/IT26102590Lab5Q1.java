import java.util.Scanner;

public class IT26102590Lab5Q1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the first number:");
		int no1= input.nextInt();
		
		System.out.print("Enter the second number:");
		int no2= input.nextInt();
		
		System.out.print("Enter the third number:");
		int no3= input.nextInt();
		
		double smallest = no1;
		double largest = no1;
		
		if (no2 <smallest)
		{smallest= no2 ;}
		if (no3< smallest)
		{smallest=no3;}
		
			
			
		if(no2> largest)
		{largest= no2;}
		if(no3>largest)
		{largest=no3;}
		
		
		System.out.println("The user inputed numbers are:" +no1 +" " +no2 +" " +no3 );
		System.out.println("The smallest number is:" +smallest);		
		System.out.println("The largest number is:" +largest);
		
	}
}