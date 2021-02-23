/*******************************
 * 2.9 (Physics: acceleration) *
 *******************************/

import java.util.Scanner;

public class Exercise_02_09 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Prompt the user for values
		System.out.print("Enter v0, v1, and t: ");
		float v0 = input.nextFloat();
		float v1 = input.nextFloat();
		float t  = input.nextFloat();
		
		// Compute average acceleration
		float averageAcceleration = (v1 - v0) / t;
		
		// Print averageAcceleration
		System.out.print("The average acceleration is: " + averageAcceleration);
	}
}
