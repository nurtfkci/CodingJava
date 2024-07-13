package lessons.conditionals;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		// IF ELSE IF
		
		/*
		 * if(condition){
		 *  statement for true condition
		 * }else{
		 *  statement for false condition
		 * }
		 * 
		 * 
		 */

		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a == b) {
			System.out.println("Numbers are equal!");
		}else if(a != b) {
			System.out.println("Numbers are not equal!");
			if(a>b) {
				System.out.println(a + ">" + b);
			}else {
				System.out.println(a + "<" + b);
			}
		}
		
		scan.close();
		
	}
}
