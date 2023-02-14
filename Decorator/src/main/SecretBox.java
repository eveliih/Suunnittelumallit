package main;

import java.util.Scanner;

public class SecretBox implements Box {

	Scanner scanner = new Scanner(System.in);
	String username = "";
	String password = "";

	@Override
	public void open() {
		System.out.println("Log in before reading secrets: ");
		while (!username.equals("user") || !password.equals("pass")) {
			System.out.println("username: ");
			username = scanner.nextLine();
			System.out.println("password: ");
			password = scanner.nextLine();
		}

		System.out.println("Tunnukset oikein!");

	}

}
