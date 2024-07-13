package lessons.intro;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		
		// Need to Import Scanner Class outside of class
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scan.next();
		
		System.out.println("Enter your birth year: ");
		int age = scan.nextInt();
		
		System.out.println("Are you a student ?");
		boolean isStudent = scan.nextBoolean();
		
		System.out.println("Hello " + name + ", you are " + (2024-age) + " years old!");
		System.out.println("Student status : " + isStudent);
		
		scan.close();
		
	}

}
