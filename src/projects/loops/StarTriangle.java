package projects.loops;

import java.util.Scanner;

public class StarTriangle {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		int i = 1;
		while(i<=num) {
			int k = 1;
			while(k<=i) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
		scan.close();
	}

}
