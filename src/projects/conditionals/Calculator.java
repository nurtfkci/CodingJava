package projects.conditionals;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		int num1, num2, res;
		char operator;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numbers: ");
		num1 =scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("Choose Operator: + - / * %");
		operator = scan.next().charAt(0);
		
		switch(operator) {
		case '+':
			res = num1+num2;
			break;
		case '-':
			res= num1 - num2;
			break;
		case'/':
			res = num1/ num2;
			break;
		case'%':
			res = num1%num2;
			break;
		case'*':
			res= num1*num2;
			break;
			default:
				System.out.println("Invalid Operator");

				res=0;
		}
		
		System.out.println("Result: " + res);
		
		scan.close();
	}

}
