package co.grandcircus;
import java.util.Scanner;
public class Circle {
	Scanner scnr = new Scanner(System.in);
	public double circleRadius;
	private double myCircleRadius;
	
public Circle(double circleRadius) {
	myCircleRadius = circleRadius;
}

public double myCircumference() {
	return 2 * Math.PI * myCircleRadius;
}

public double myArea() {
	return Math.PI * Math.pow(myCircleRadius, 2);
}
	
public static String formatNumber(double x) {
	return String.format("%.2f", x);
	
}

public String getFormattedCircumference() {
	return formatNumber(myCircumference());
}
	
public String getFormattedArea() {
	return formatNumber(myArea());
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
