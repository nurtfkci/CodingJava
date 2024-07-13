package projects.intro;

import java.util.Scanner;

public class CalculateVAT {
	
	// VAT : Value Added Tax
	
	public static void main(String[] args) {
		
		double price, taxedPrice, taxAmount;
		double tax= 0.18;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Price of your item: ");
		price = scan.nextDouble();
		
		// (price * tax) + price
		taxedPrice = price * (tax + 1);
		taxAmount = price * tax;
		
		System.out.println("Your total is " + taxedPrice+ "$");
		System.out.println("Tax Amount : " + taxAmount + "$");
		
		scan.close();
		
	}
	

}
