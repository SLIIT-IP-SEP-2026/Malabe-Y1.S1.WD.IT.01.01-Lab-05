import java.util.Scanner;

public class IT26102588Lab5Q1{
	public static void main(String[]args){
		int num1,num2,num3,max,min;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		
		if (num1>num2 && num1>num3){
			max = num1;
			if(num2<num3){
				min = num2;
			} else {
				min = num3;
			}
		} else if (num2>num1 && num2>num3){
			max = num2;
			if (num1<num3){
				min = num1;
			}else {
				min = num3;
			}
		} else {
			max = num3;
			if(num1<num2){
				min = num1;
			} else {
				min = num2;
			}
		}
		System.out.print("\n");
		System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
		System.out.println("The Smallest number is : "+min);
		System.out.println("The Largest number is : "+max);
	}
}