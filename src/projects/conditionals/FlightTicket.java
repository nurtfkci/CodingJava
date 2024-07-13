package projects.conditionals;

import java.util.Scanner;

public class FlightTicket {

	public static void main(String[] args) {

		/*
		 * price per mile : 0.10 age less than 12 - 50% discount,
		 * over 12 less than 24 - 10%,
		 * discount over 65 - 30% discount
		 * 
		 * round flight, 20% discount
		 * 
		 */

		String name;
		double discount=0, price = 0, perMile = 0.10;
		int age, miles;
		char answer;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		name = scan.nextLine();

		System.out.println("Miles : ");
		miles = scan.nextInt();

		System.out.println("Enter your age: ");
		age = scan.nextInt();

		System.out.println("Is it a One Way flight? ");
		answer = scan.next().charAt(0);
		
		price += (miles*perMile);
		discount=price;
		
		if((age>0 || age<100) && miles>0) 
		{
			if(age<=12) {
				price*=0.5;
			}else if(age<=24) {
				price*=0.9;
			}else if(age>=65) {
				price*=0.7;
			}
			
			if(answer=='y' || answer =='Y') {
				System.out.println("You have a one-way flight!");
			}else if(answer=='N' || answer=='n') {
				price*=1.6;
			}else {
				System.out.println("Flight Type Discount not applicapale!");
			}
			
			discount -=price;
			
			System.out.println("\nHello " + name + " and Welcome to Perdure Flights!");
			System.out.println("Your Ticket is " + price + "$" );
			System.out.println("Your discount amount is " + Math.abs(discount) + "$");
			
			
		}else {
			System.out.println("Given Information is not valid!");
		}
		
		scan.close();
		

	}

}
