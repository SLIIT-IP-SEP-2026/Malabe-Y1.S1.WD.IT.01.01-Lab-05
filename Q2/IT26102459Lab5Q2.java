import java.util.Scanner;
public class IT26102459Lab5Q2{
     public static void  main(String[]args){
	  
	 Scanner input = new Scanner(System.in);
	  
	 int members ;
	 
	 System.out.print("Enter the numbers of new members introduced : ");
	  members = input.nextInt();
	  
	 if (members >= 0){
	    switch(members){
		
		 case 0 :
		    System.out.print("No prize"); 
			break;
			
	     case 1:
     		 System.out.print("Prize is a : pen");
			 break ;
			 
	     case 2:
             System.out.print("Prize is a : umbrella");
            break;			 
			
		 case 3:
             System.out.print("Prize is a : bag");
            break;			 	
			
		 case 4:
             System.out.print("Prize is a : Travelling chair");
            break;			 	
			
		 default :
             System.out.print("Prize is a : headphone");
			 
		}
       } 
     
         else{
             System.out.print("	 Input must be a number 0 or greater");
		   }
			 
		}
  }		
			 
			 