/********************************
 * 2.3 Convert feet into meters *
 ********************************/

import java.util.Scanner;

public class Exercise_02_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double ONE_FOOT = 0.305;
		// Get value in for feet in double
		System.out.print("Enter a value in feet: ");
		double feet = input.nextDouble();
		// Convert to feet
		double meters = feet * ONE_FOOT;
		// Display results
		System.out.print(feet + " feet is " + meters + " meters.");
	}
}
