/***************************************
 * 2.4 (Convert pounds into kilograms) *
 ***************************************/

import java.util.Scanner;

public class Exercise_02_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Constant
		final double ONE_POUND = 0.454;
		
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		// Convert to kilograms
		double kilograms = pounds * ONE_POUND;
		// Display result
		System.out.print(pounds + " pounds is " + kilograms + " kilograms.");
	}
}
