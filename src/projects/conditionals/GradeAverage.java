package projects.conditionals;

import java.util.Scanner;

public class GradeAverage {
	
	public static void main(String[] args) {
		
		int math, literature, PE, socials ,science;
		double average;
		String grade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Grade for Math: ");
		math = scan.nextInt();
		
		System.out.println("Grade for Literature: ");
		literature = scan.nextInt();
		
		System.out.println("Grade for PE: ");
		PE = scan.nextInt();
		
		System.out.println("Grade for Social Studies: ");
		socials = scan.nextInt();
		
		System.out.println("Grade for Science: ");
		science = scan.nextInt();
		
		average = (math + literature + PE + socials + science)/5;
		
		if(average <50 ) {
			grade = "FAILED";
		}else {
			grade = "PASSED";
		}
		
		System.out.println("You have " + grade + " the class with " + average + " average!");
		scan.close();

	}

}
