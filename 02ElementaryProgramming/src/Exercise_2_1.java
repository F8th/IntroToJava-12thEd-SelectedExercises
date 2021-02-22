/***************************************
 * 2.1 (Convert Celsius to Fahrenheit) *
 ***************************************/

import java.util.Scanner;

public class Exercise_2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get degree in celsius
		System.out.print("Enter a degree in celsius: ");
		double celsius = input.nextDouble();
		
		// Convert celsius to fahrenheit
		double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
		
		// Display result
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
 }
}