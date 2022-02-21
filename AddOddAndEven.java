package Chapter5;
import java.util.Scanner;
public class AddOddAndEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int evenSum = 0;
		int oddSum = 0;
		int num = 0;
		System.out.println("Enter the positive numbers you want to add (type -1 when done)");
		
		while(num != -1){
			num = input.nextInt();
			if (num % 2 == 0) {
				evenSum += num;
			}
			else {
				oddSum += num;
			}
		}
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);
	}
}
