import java.util.Scanner;
public class IT26102417Lab5Q1{
   public static void main(String[]args){
     
	   Scanner input = new Scanner(System.in);
	   
	   int num1,num2,num3,smallest,largest;
	  

       System.out.print(" THe first integer is :");
         num1 = input.nextInt();
		 
	   System.out.print(" The second integer is: ");
         num2 = input.nextInt();

       System.out.print("The third integer is ");
         num3 = input.nextInt();

       smallest = num1;
       largest = num1; 
  
     if (num2 < smallest){
          smallest = num2;
	 }
 
     if (num2 > largest){
		 largest = num2;
	 }
	 
	 if(num3 > smallest){
		 smallest = num3;
	 }
	 
	 if(largest > num3){
	     largest = num3; 
	 }
	 
	   
	   
	   System.out.println();
	   System.out.println("The numbers are : " + num1 +"  " + num2 +"  " + num3);
	   System.out.println("The smallest number is: " + smallest);
	   System.out.println("The largest number is : " + largest);
     }  

}