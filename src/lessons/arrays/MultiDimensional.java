package lessons.arrays;

import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {

		int arr[][] = new int[3][4];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Value for index  [" + i + "][" + j + "]");
				arr[i][j] = scan.nextInt();
			}
		}

		// For Each

		for (int ar[] : arr) {
			for (int a : ar) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		scan.close();

	}

}
