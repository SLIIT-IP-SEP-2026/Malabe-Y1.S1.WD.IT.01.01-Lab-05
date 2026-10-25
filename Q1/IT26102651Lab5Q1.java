import java.util.Scanner;
public class IT26102651Lab5Q1{
public static void main (String[]args){


int numberOne , numberTwo , numberThree , smallest , largest;

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer:");
numberOne = input.nextInt();

System.out.print("Enter the second integer:");
numberTwo = input.nextInt();

System.out.print("Enter the third integer:");
numberThree = input.nextInt();

smallest = numberOne;
largest = numberOne;

if (numberTwo < smallest){
    smallest = numberTwo;
}
if (numberTwo < largest){
    largest = numberTwo;
}

if (numberThree < smallest){
    smallest = numberTwo;
}
if (numberThree < largest){
    largest = numberTwo;
}

System.out.println();
System.out.println("User entered numbers are : " + numberOne + " " + numberTwo + " " + numberThree);
System.out.println("The Smallest nuumber is: " + smallest);
}

}