import java.util.Scanner;
	public class IT26102344Lab5Q2{
		public static void main(String[] args){
			
			Scanner input = new Scanner(System.in);
			
			int members;
			
			System.out.print("enter the number of new members introduced:");
			members=input.nextInt();
			
			if(members>=5){
				System.out.print("pize is a : headphone");
			}
			else if(members==4){
				System.out.print("pize is a : travelling chair");
			}
			else if(members==3){
				System.out.print("pize is a : bag");
			}
			else if(members==2){
				System.out.print("pize is a : umbrella");
			}
			else if(members==1){
				System.out.print("pize is a : pen");
			}
			else if(members==0){
				System.out.print("no prize");
			}
			else{
				System.out.print("input must be a number 0 or greater");
			}
			
			
			
		}
	}
