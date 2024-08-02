package projects.special;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {

		int average, sum = 0;
		int count = 0;

		int[] grades = new int[7];
		String[] lessons = new String[7];

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to grade calculator!");

		for (int i = 0; i < lessons.length; i++) {
			System.out.println("Name of your lesson: ");
			lessons[i] = scan.next();
			System.out.println("Grade of your lesson: ");
			grades[i] = scan.nextInt();

		}

		for (int g : grades) {
			sum += g;
			count++;
		}

		average = sum / count;

		System.out.println("Your grade average: " + average);
		scan.close();
	}

}
