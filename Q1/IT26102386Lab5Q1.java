import java.util.Scanner;
public class IT26102386Lab5Q1
{
	public static void main (String[]args)
	{
		int num1, num2, num3, smallest,largest;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first integer:");
		num1=input.nextInt();
		System.out.print("Enter the second integer:");
		num2=input.nextInt();
		System.out.print("Enter the third integer:");
		num3=input.nextInt();
		smallest=num1;
		largest=num1;
		if (smallest>num2) {
		    smallest=num2;
		}
		if(smallest>num3){
		    smallest=num3;
		}
		if (largest<num2){
			largest=num2;
		}
		if (largest<num3){
			largest=num3;
		}
		System.out.println(" ");
		System.out.println("The user entered numbers are:" + num1+ " " + num2 +" " + num3);
		System.out.println("The smallest number is:" +smallest);
		System.out.println("The smallest number is:" +largest);
	}
}
		
			
			
			