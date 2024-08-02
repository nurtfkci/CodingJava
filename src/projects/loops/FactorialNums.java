package projects.loops;

import java.util.Scanner;

public class FactorialNums {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();

		int i = 1;
		while (num > 1) {
			i *= num;
			num--;
		}

		System.out.println(i);
		scan.close();

	}

}
