
import java.util.Scanner;

public class IT26100133Lab5Q2
{
	public static void main(String[] args)
	{
		int numberOfMembers;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of new members: ");
		numberOfMembers = input.nextInt();

		if (numberOfMembers < 0)
		{
			System.out.println("Number must be greater than or equal to 0");
			return;
		}

		switch (numberOfMembers)
		{
			case 0:
				System.out.println("Prize: No Prize");
				break;

			case 1:
				System.out.println("Prize: Pen");
				break;

			case 2:
				System.out.println("Prize: Umbrella");
				break;

			case 3:
				System.out.println("Prize: Bag");
				break;

			case 4:
				System.out.println("Prize: Travelling Chair");
				break;

			default:
				System.out.println("Prize: Headphone");
		}
	}
}
