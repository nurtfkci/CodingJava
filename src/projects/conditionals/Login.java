package projects.conditionals;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		String user = "grimaren", pass = "Besiktas.1903";
		String username, password;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your username: ");
		username = scan.next();

		System.out.println("Enter your password: ");
		password = scan.next();

		if (user.equals(username) && pass.equals(password)) {
			System.out.println("Successfully Logged In!");
		} else {
			System.out.println("Username or Password is Incorrect!");
		}

		scan.close();

	}

}
