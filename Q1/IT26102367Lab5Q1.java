import java.util.Scanner;

public class IT26102367Lab5Q1{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first no: ");
		int firstno=input.nextInt();
		
		System.out.println("Enter the second no: ");
		int secondno=input.nextInt();
		
		System.out.println("Enter the third no: ");
		int thirdno=input.nextInt();
		
		System.out.println("User enterd numbers are: "+ firstno +" "+ secondno+" "+ thirdno);
		
		if(firstno>secondno && firstno>thirdno){
		System.out.println("The largest no are: "+firstno);
		}else if(secondno>thirdno){
			System.out.println("The largest no are: "+secondno);
		}else{
			System.out.println("The largest no are: "+thirdno);
		}
		
		if(firstno<secondno && firstno<thirdno){
			System.out.println("The smallest no are: "+firstno);
		}else if(secondno<thirdno){
			System.out.println("The smallest no are: "+secondno);
		}else{
			System.out.println("The smallest no are: "+thirdno);
		}
	
	}
}