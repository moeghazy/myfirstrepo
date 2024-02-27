package com.neotech.com26;

public class Registration {

	/**
	 * Create Registration Class in which you would have variables as email,
	 * userName and password that have an access scope only within its own class.
	 * After creating an object of the class user should be able to call methods and
	 * in each method separately pass values to set users email, userName and
	 * password Requirements: Valid email consider to be only yahoo! Valid userName
	 * and password cannot be empty and should be of length larger than 6
	 * characters. Also valid password cannot contain userName.
	 **/

	private String userName, email, password;

	// Setting up the getters && setters

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {

		if (!userName.isEmpty() && userName.length() > 6) {

			this.userName = userName;
		}  else System.out.println("invalid user name ");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {

		if (!email.isBlank() && email.contains("@yahoo") && email.length() > 6) {
			this.email = email;
		}
		else
			System.out.println("invalid email");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		if (!password.contains(userName)) {

			this.password = password;
		}  else System.out.println("invalid password");

	}

}
