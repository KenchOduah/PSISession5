package Chapter5;
import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the number to be reversed");
		 int number = input.nextInt();
		 
		 int reversedInt = 0;
	     int remainder = 0;
	     
	     while (number != 0) {
	       remainder = number % 10;
	       reversedInt = (reversedInt * 10) + remainder;
	       number = number / 10;
	     }
	     System.out.println("reversedInt is : " + reversedInt);
	}
	

}
