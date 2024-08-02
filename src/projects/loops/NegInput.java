package projects.loops;

import java.util.Scanner;

public class NegInput {
	
	public static void main(String[] args) {
		
		int num;
		int total=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please enter a number: ");
			num = scan.nextInt();
			
			if(num %2 ==0) {
				total+=num;
			}
			
		}while(num>0);
		
		System.out.println("Congrats! You are out of the loop!");
		System.out.println("Total of even numbers guessed: " + total);
		
		scan.close();
	}

}
