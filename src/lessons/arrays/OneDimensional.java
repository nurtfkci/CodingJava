package lessons.arrays;

import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {

		// Arrays
		// used to store multiple same type variables.

		// dataType name[] = new dataType[arraySize];
		// dataType[] name = new dataType[arraySize];
		// dataType[] name = {n1,n2,n3,...};

		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		Scanner scan = new Scanner(System.in);
		int arrs[] = new int[10];
		for (int i = 0; i < arrs.length; i++) {
			System.out.println("Value for index " + i);
			arrs[i] = scan.nextInt();
		}

		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + "  ");
		}
		
		System.out.println("\nFOREACH");
		
		for(int n : arr) 
		{
			System.out.print(n + " ");
		}

		scan.close();
	}

}
