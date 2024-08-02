package projects.special;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {

		int guess, lives = 5;

		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int r = random.nextInt(20) + 1;

		while (lives > 0) {

			System.out.println("Guess the number: ");
			guess = scan.nextInt();

			if (guess == r) {

				System.out.println("Congrats you won!");
				break;
			} else {

				System.out.println("Please try again!");
				System.out.println("Lives left : " + --lives);
			}

		}

		if (lives == 0) {
			System.out.println("You lost the game!");
			System.out.println("Number was " + r);
			System.out.println("Play again!");
		}

		scan.close();

	}

}
