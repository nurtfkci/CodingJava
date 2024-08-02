package projects.loops;

import java.util.Scanner;

public class NegativeInput {
	
	public static void main(String[] args) {
		
		int num;
		int total=0;
		boolean loop = true;
		Scanner scan = new Scanner(System.in);
		
		while(loop) {
			System.out.println("Please enter a number: ");
			num = scan.nextInt();
			
			if(num<0) {
				System.out.println("Congrats! You are out of the loop!");
				loop = false;
			}else {
				// continue;
				if(num%2==1){
					total+=num;
				}
			}
		}
		System.out.println("Total of odd numbers entered: " + total);
		scan.close();
	}

}
