/***********************************************
 * 2.5 (Financial Application: Calculate tips) *
 ***********************************************/

import java.util.Scanner;

public class Exercise_02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Constant
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
	    // Compute total
		double total = (subtotal * (gratuityRate / 100.0)) + subtotal;
		
		// Display result
		System.out.print("The gratuity is $" + (gratuityRate/100 * subtotal) + " and total is $" + total);
	} // END main
}