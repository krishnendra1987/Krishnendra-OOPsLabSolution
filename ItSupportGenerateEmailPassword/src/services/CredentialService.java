package services;

import java.security.SecureRandom;

public class CredentialService {

	private static String emailId = "";
	private static String password = "";
	private static String userFirstName = "";

	private static SecureRandom random = new SecureRandom();

	/** different dictionaries used */
	private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMERIC = "0123456789";
	private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

	/**
	 * Method will generate random string based on the parameters
	 * 
	 * @param len the length of the random string
	 * @param dic the dictionary used to generate the password
	 * @return the random password
	 */
	public static String generatePassword(int len, String dic) {
		String result = "";
		for (int i = 0; i < len; i++) {
			int index = random.nextInt(dic.length());
			result += dic.charAt(index);
		}
		return result;
	}

	/**
	 * Below method is used for generating password after passing required validation require to generate password.
	 */
	public static void generatePassword() {
		password = generatePassword(8, ALPHA_CAPS + ALPHA + SPECIAL_CHARS + NUMERIC);
	}

	/**
	 * Below method is used for generating email after taking first name, last name and department as parameters. 
	 * @param firstName
	 * @param lastName
	 * @param department
	 */
	public static void generateEmailAddress(String firstName, String lastName, String department) {

		userFirstName = firstName;
		emailId = firstName + lastName + "@" + department + ".abc.com";

	}
	
    /**
     * Below method is used for showing credentials of user.
     */
	public static void showCredentials() {
		System.out.println("Dear " + userFirstName.substring(0, 1).toUpperCase() + userFirstName.substring(1)
				+ " your generated credentials are as follows");
		System.out.println("Email-->" + emailId);
		System.out.println("Password -->" + password);

	}
}
