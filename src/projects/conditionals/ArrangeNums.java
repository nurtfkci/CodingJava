package projects.conditionals;

import java.util.Scanner;

public class ArrangeNums {

	public static void main(String[] args) {

		int a, b, c;
		boolean equal, A, B;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three different numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		equal = (a == b || a == c || b == c );

		A = (a > b && a > c);
		B = (b > a && b > c);

		if (!equal) {
			if (A) {
				if (b > c) {
					System.out.println(a + " > " + b + " > " + c);
				} else {
					System.out.println(a + " > " + c + " > " + b);

				}
			} else if (B) {
				if (a > c) {
					System.out.println(b + " > " + a + " > " + c);
				} else {
					System.out.println(b + " > " + c + " > " + a);
				}
			} else {
				if (a > b) {
					System.out.println(c + " > " + a + " > " + b);
				} else {
					System.out.println(c + " > " + b + " > " + a);
				}
			}
		} else {
			System.out.println("Numbers are not different!");
		}

		scan.close();

	}

}
