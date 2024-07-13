package projects.intro;

import java.util.Scanner;

public class AreaPerimeterCircle {
	
	// Area : pi*r^2
	// Perimeter : 2*pi*r
	
	public static void main(String[] args) {
		
		int radius;
		double area, perimeter, pi=3.14159265359;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Radius of your circle: ");
		radius = scan.nextInt();
		
		area = pi * (radius*radius);
		perimeter = 2 * pi * radius;
		
		System.out.println("Area of your circle: "+ area);
		System.out.println("Perimeter of your circle: " + perimeter);
		
		scan.close();
		
	}

}
