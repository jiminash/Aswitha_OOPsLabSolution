package com.abc.Itadministrator.service;

import java.util.Scanner;

import com.abc.Itadministrator.model.Employee;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the firstname");
		String firstName = sc.nextLine();

		System.out.println("Please enter the lastName");
		String lastName = sc.nextLine();

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		System.out.println("choose the option from above:");
		int choice = sc.nextInt();
		Employee e = new Employee(firstName, lastName);
		CredentialService c = new CredentialService();

		switch(choice) {
		case 1:
			c.showCredentials(e,"Technical");
			break;
		case 2:
			c.showCredentials(e,"Admin");
			break;
		case 3:
			c.showCredentials(e,"Human Resource");
			break;
		case 4:
			c.showCredentials(e,"Legal");
			break;
		default:
			System.out.println("Invalid option");
		}
	}


}


