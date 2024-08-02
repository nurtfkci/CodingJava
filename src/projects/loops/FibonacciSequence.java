package projects.loops;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {

		int num;
		int total;
		int n = 0;
		int n1 = 1;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		num = scan.nextInt();

		for (int i = 0; i <= num; i++) {
			System.out.print(n + " ");
			total = n + n1;
			n = n1;
			n1 = total;

		}

		scan.close();

	}

}
