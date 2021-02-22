
import java.util.Scanner;

public class Exercise_02_02 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		// Constant double for PI
		final double PI = 3.141592;
		// Get radius
		double radius = input.nextDouble();
		// Get length
		double length = input.nextDouble();
		// Compute area
		double area = Math.pow(radius, 2.0) * PI;
		// Compute volume
		double volume = area * length;
		
		// Display results
		System.out.println("The area is   " + area);
		System.out.println("The volume is " + volume);
	}

}
