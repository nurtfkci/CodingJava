package projects.loops;

import java.util.Scanner;

public class HarmonicNums {
	
	public static void main(String[] args) {
		
		double num,res=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		num=scan.nextDouble();
		
		while(num>=1) {
			res+=1/num;
			num--;	
		}
		
		System.out.println(res);
		scan.close();
	}

}
