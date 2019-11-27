package Usernameandpassword;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailusernameandpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	    Pattern pass = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter the Email Id");
		String email=s.next();
		Matcher emailmatch=pattern.matcher(email);
		System.out.println("Enter the Password");
		String password=s.next();
		Matcher passwordmatch=pass.matcher(password);
		if(emailmatch.matches())
		{
			System.out.println("Valid Email Id");
		}
		else
		{
			System.out.println("Invalid Email Id");
		}
		if(passwordmatch.matches())
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid ");
		}
		
	}

}
