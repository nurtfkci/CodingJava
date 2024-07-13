package projects.intro;

import java.util.Scanner;

public class CalculateGPA {
	
	// Take 3 inputs for midterms, finals, and a quiz
	// Calculate gpa for the class, show status if the class is PASSED or FAILED
	
	public static void main(String[] args) {
		
		String className, classStatus;
		double gpa, midterm, finals, quiz;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your class name: ");
		className = scan.nextLine();
		
		System.out.println("Midterm Score : ");
		midterm = scan.nextDouble();
		
		System.out.println("Quiz Score : ");
		quiz = scan.nextDouble();
		
		System.out.println("Final Score : ");
		finals = scan.nextDouble();
		
		gpa = (midterm * 0.4) + (finals * 0.4) + (quiz * 0.2);
		classStatus = (gpa>50) ? "PASSED" : "FAILED";

		
		System.out.println("Your Grade Point Average for " + className + " class : " + gpa);
		System.out.println("You have " + classStatus + " this class!");
		
		
		scan.close();
	}

}
