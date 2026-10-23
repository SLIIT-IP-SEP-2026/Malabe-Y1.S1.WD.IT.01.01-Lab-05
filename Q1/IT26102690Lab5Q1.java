import java.util.Scanner;
public class IT26102690Lab5Q1{
	public static void main (String[] args){
		
		int num1,num2,num3;
		int largest,smallest;
		
		largest = 0;
		smallest = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first integer:");
        num1 = input.nextInt();
		
		System.out.println("Enter the secound integer:");
        num2 = input.nextInt();
		
		System.out.println("Enter the Third integer:");
        num3 = input.nextInt();
		
		if (num1 == num2 || num1 == num3 || num2 == num3 ){
			System.out.println("Enter 3 unique numbers :");
			
		}else {
			
			
			largest = num1;
            smallest = num1;			
			
			if (num2 > largest){
				
				largest = num2;
			}

			if (num3 > largest){
				
				largest = num3;
			}
			
			if (num2 < smallest){
				smallest = num2;
			}	
				
			if (num3 < smallest){ 
			
				smallest = num3;
			}
			
		}
		
		System.out.println("Largest Num is : " + largest);
		System.out.println( "Smallest num is :" + smallest);
		
		
		
					
			
		
        
        		
	}
}