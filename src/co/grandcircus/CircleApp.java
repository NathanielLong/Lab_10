package co.grandcircus;
import java.util.Scanner;
public class CircleApp {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	char tryAgain = 'y';
	double circleRadius;
	
	do {
	circleRadius = Validator.getDouble(scnr, "Please enter the radius: ");
	Circle circ = new Circle(circleRadius);
	
	System.out.println("Area: " + circ.getFormattedArea());
	System.out.println("Circumference: " + circ.getFormattedCircumference());
	System.out.println("Would you like to try again? (y/n): ");
	tryAgain = scnr.next().charAt(0);
	} while(tryAgain == 'y');
	System.out.println("Good-Bye");

	scnr.close();
	}
}
