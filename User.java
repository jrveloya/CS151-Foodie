package Foodie;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User {
	private String userName;
	private String userID;
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	/*
	 * sourced from : https://www.geeksforgeeks.org/how-to-validate-a-username-using-regular-expressions-in-java/
	 */

	public boolean userNameChecker(String userName) {
		/*
		 * regex to check valid username
		 */
		String regex = "^[A-Za-z]\\w{11,15}$";
		
		/*
		 * compile from regex class
		 */
		Pattern p = Pattern.compile(regex);
		
		/*
		 * if username is empty, return false
		 */
		if(userName == null) {
			return false;
		}
		/* 
		 * pattern class contains matcher() method
		 * to find matching between given username 
		 * and regular expression 
		 */
		Matcher m  = p.matcher(userName);
		/*
		 * return if the username matched the regex
		 */
		return m.matches();
	}
	
	/*
	 * checks the validity of the password, used similar logic to method above.
	 */
	public boolean passwordChecker(String password) {
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		
		if(password == null) {
			return false;
		}
		
		Matcher m = p.matcher(password);
		
		return m.matches();
	}
	
}
