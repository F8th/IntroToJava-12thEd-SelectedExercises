/************************
 * 2.18 (Print a table) *
 ************************/
import java.util.Scanner;

public class Exercise_02_18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a Scanner object

		// Declare two floating-point numbers
				float a = 1, b = 2;
			    // Line 1	
				System.out.println("a   b   pow(a, b)");
				System.out.println((int)(a) + "   " + (int)(b) + "   " + (int)(Math.pow(a, b)));
				a++;
				b++;
				// Line 2
				System.out.println((int)(a) + "   " + (int)(b) + "   " + (int)(Math.pow(a, b)));
				a++;
				b++;
				// Line 3
				System.out.println((int)(a) + "   " + (int)(b) + "   " + (int)(Math.pow(a, b)));
				a++;
				b++;
				// Line 4
				System.out.println((int)(a) + "   " + (int)(b) + "   " + (int)(Math.pow(a, b)));
				a++;
				b++;
				// Line 5
				System.out.println((int)(a) + "   " + (int)(b) + "   " + (int)(Math.pow(a, b)));
	}
}
