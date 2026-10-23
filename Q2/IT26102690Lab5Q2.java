import java.util.Scanner ;

public class  IT26102690Lab5Q2 {
	public static void main (String[] args){
		int Refnum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter No of Referels :");
		Refnum = input.nextInt();
		
        if (Refnum >= 0) {
			
			switch(Refnum){
				case 0:
				    System.out.println("No Prize");
					break;
				
				case 1:
				    System.out.println("Pen");
					break;
					
				case 2:
				    System.out.println("Umbrella");
					break;
					
				case 3:
				    System.out.println("Bag");
					break;
					
				case 4:
				    System.out.println("Travelling Chair");
					break;
					
				default:
				    System.out.println("HeadPhone");
					break;
			}
		
		
		}else{
			
			System.out.println("Should be greater than or equal to zero");
		}
		
		
	}
}