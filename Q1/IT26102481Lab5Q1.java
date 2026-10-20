import java.util.Scanner;
	public class  IT26102481Lab5Q1{
		public static void main(String[] arg){
			Scanner input = new Scanner(System.in);
			
			int a,b,c;
			int smallest,largest;
			
			System.out.print("enter the first integer: ");
			a=input.nextInt();
			
			System.out.print("enter the second integer: ");
			b=input.nextInt();
			
			System.out.print("enter the third integer: ");
			c=input.nextInt();
			
			System.out.print("user entered number are:  " +a+" "+b+" "+c);
			
			smallest = a;
			largest = a;
			
			if(smallest>b){
				smallest=b;
			}
			 if(smallest>c){
				smallest=c;
			}
			
			if(largest<b){
				largest=b;
			}
			 if(largest<c){
				largest=c;
			}
			;
			System.out.println("the smallest number is : "+smallest);
			System.out.println("the largest number is : "+largest);
		}
	}