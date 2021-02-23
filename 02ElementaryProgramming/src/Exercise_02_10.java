/**************************************
 * 2.10 (Science: calculating energy) * 
 **************************************/
/***********************************************************
 * This program calculates the energy needed to heat water *
 * from an initial temperature to a final temperature      *
 ***********************************************************/

import java.util.Scanner;

public class Exercise_02_10 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amout of water in kilograms: ");
		double m = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double q = m * (finalTemperature - initialTemperature) * 4184;
		
		System.out.print("The energy needed is " + q);
	}
}