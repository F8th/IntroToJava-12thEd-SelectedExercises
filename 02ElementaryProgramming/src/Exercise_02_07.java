/**********************************
 * 2.7 (Find the number of years) *
 **********************************/

import java.util.Scanner;

public class Exercise_02_07 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		// Declare constants
		final int MINUTES_PER_YEAR = 525600;
		final int MINUTES_PER_DAY = 1440;
		
		// Get number of minutes
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		// Convert minutes to years
		int numberOfYears = (int)(minutes) / MINUTES_PER_YEAR;
		// Convert minutes to days
		int remainingMinutes = (int)(minutes) % MINUTES_PER_YEAR;
		int numberOfDays = remainingMinutes / 1440;
		
		// Display result
		System.out.print(minutes + " minutes is approximately " + numberOfYears + " and " + numberOfDays + " days.");
	}
}
