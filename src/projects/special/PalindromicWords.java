package projects.special;

import java.util.Scanner;

public class PalindromicWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String word, rev = "";

		System.out.println("Please enter the word: ");
		word = scan.next();

		for (int i = word.length() - 1; i >= 0; i--) {

			rev += word.charAt(i);
		}

		if (rev.equalsIgnoreCase(word)) {
			System.out.println(word + " is a palindromic word!");
		} else {
			System.out.println(word + " is not s a palindromic word!");

		}

		scan.close();

	}

}
