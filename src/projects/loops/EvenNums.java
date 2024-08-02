package projects.loops;

public class EvenNums {

	public static void main(String[] args) {

		// even numbers between 1 and 100

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		int i = 0;
		while (i <= 100) {
			i+=2;
			System.out.print(i + " ");
		}

		System.out.println();

		int k = 1;
		do {
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
			k++;

		} while (k <= 100);

	}

}
