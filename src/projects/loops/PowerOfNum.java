package projects.loops;

import java.util.Scanner;

public class PowerOfNum {
	
	public static void main(String[] args) {
		
		int num, pow,res=1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number: ");
		num = scan.nextInt();
		
		System.out.println("Please enter the exponential: ");
		pow = scan.nextInt();
		
		while(pow>0) {
			res*=num;
			pow--;
		}
		
		System.out.println(res);
		scan.close();
	}

}
