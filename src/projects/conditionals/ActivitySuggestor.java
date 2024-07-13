package projects.conditionals;

import java.util.Scanner;

public class ActivitySuggestor {
	
	public static void main(String[] args) {
		
		int temp;
		String activity="";
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Welcome to Activities!");
		System.out.println("Enter the weather degree in Celcius: ");
		temp = scan.nextInt();
		
		if(temp>-10 && temp<45) {
			if(temp<=4) {
				activity="ski";
			}else if(temp<=30) {
				activity = "cinema";
			}else {
				activity="swimming";
			}
		}else {
			System.out.println("Invalid degree!");
		}
		
		System.out.println("Our suggestion of activity is " + activity);
		scan.close();
	}

}
