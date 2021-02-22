/*************************************
 * 2.6 (Sum the digits in an integer *
 *************************************/

import java.util.Scanner;

public class Exercise_02_06 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		// Initialize sum to 0
		int sum = 0;
		// Add extracted digit to sum
		sum += number % 10;
		
		// Remove extracted digit
		number /= 10;
		
		// Add next extracted digit to sum
		sum += number % 10;
		
		// Remove extracted digit
		number /= 10;
		
		// Add last extracted digit
		sum += number % 10;
		
		// Display final sum
		System.out.print("The sum of the digits is " + sum);
	}
}