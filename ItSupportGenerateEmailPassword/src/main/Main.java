package main;

import java.util.Scanner;

import department.Department;
import model.Employee;
import services.CredentialService;

public class Main {
	private static Scanner scanner;
	private static Employee employee;

	public static void main(String[] args) {

		init();
		showEmployeeCredentials();

	}

	/**
	 * Method for initialization.
	 */
	private static void init() {
		employee = new Employee("krishnendra", "paliwal");
		scanner = new Scanner(System.in);
	}

	/**
	 * Below method is used for showing employee credentials based on selected
	 * department by user.
	 */
	private static void showEmployeeCredentials() {
		System.out.println(
				"Please enter the department from following \n1.Technical\n2.Admin\n3.Human Resource\n4.Legal");

		switch (scanner.nextInt()) {

		case 1:
			CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					Department.TECHNICAL.getDepartMentName());
			CredentialService.generatePassword();
			CredentialService.showCredentials();
			break;

		case 2:

			CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					Department.ADMIN.getDepartMentName());
			CredentialService.generatePassword();
			CredentialService.showCredentials();
			break;

		case 3:
			CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					Department.HUMAN_RESOURCE.getDepartMentName());
			CredentialService.generatePassword();
			CredentialService.showCredentials();

			break;
		case 4:
			CredentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),
					Department.lEGAL.getDepartMentName());
			CredentialService.generatePassword();
			CredentialService.showCredentials();

			break;
		default:
			System.out.println("No Department Found");

		}
		scanner.close();
	}

}
