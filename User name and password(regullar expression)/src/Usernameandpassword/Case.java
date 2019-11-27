package Usernameandpassword;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Case {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Login obj=new Login();
		
		//name
		Pattern name1 = Pattern.compile("[A-Z][a-z]*");
		System.out.println("Enter the Name");
		String name=s.next();
	    Matcher namematch=name1.matcher(name);
	  //name matches
	  		if(namematch.matches())
	  		{
	  			System.out.println("Valid name");
	  		}
	  		else
	  		{
	  			System.out.println("Invalid name");
	  		}
	    Pattern name21 = Pattern.compile("[A-Z]+([ '-][a-zA-Z]+)*");
		System.out.println("Enter the Last Name");
		String name22=s.next();
	    Matcher name22match=name21.matcher(name22);
	    if(name22match.matches())
		{
			System.out.println("Valid name");
		}
		else
		{
			System.out.println("Invalid name");
		}
		
		//email
	    String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	    Pattern pattern = Pattern.compile(regex);
	    System.out.println("Enter the Email Id");
		String email=s.next();
	    Matcher emailmatch=pattern.matcher(email);
	  //email matches
	  		if(emailmatch.matches())
	  		{
	  			System.out.println("Valid Email");
	  		}
	  		else
	  		{
	  			System.out.println("Invalid Email");
	  		}
		//reg
		Pattern reg1 = Pattern.compile("[0-9]*");
		System.out.println("Enter the Register number");
		String reg=s.next();
		   Matcher regmatch=reg1.matcher(reg);
		 //reg
			if(regmatch.matches())
			{
				System.out.println("Valid Register number");
			}
			else
			{
				System.out.println("Invalid Register number");
			}
		 
		   //rank
		   Pattern rank1 = Pattern.compile("[0-9]*");
		System.out.println("Enter the Rank");
		String rank=s.next();
		   Matcher rankmatch=rank1.matcher(rank);

			//rank
			if(rankmatch.matches())
			{
				System.out.println("Valid Register number");
			}
			else
			{
				System.out.println("Invalid Register number");
			}
		//year
		   Pattern year1 = Pattern.compile("^\\d{4}$");
		System.out.println("Enter the Year");
		String year=s.next();
		 Matcher yearmatch=year1.matcher(year);

			//year
			if(yearmatch.matches())
			{
				System.out.println("Valid Year");
			}
			else
			{
				System.out.println("Invalid Year");
			}
		
		//Department
		 Pattern dep1 = Pattern.compile("[A-Z][.][a-z]*");
		System.out.println("Enter the Department");
		String dep=s.next();
		 Matcher depmatch=dep1.matcher(dep);
		//Department matches
		if(depmatch.matches())
		{
			System.out.println("Valid Department");
		}
		else
		{
			System.out.println("Invalid Department");
		}
		
		if(namematch.matches()&&name22match.matches()&&emailmatch.matches()&&regmatch.matches()&&rankmatch.matches()&&yearmatch.matches()&&depmatch.matches())
		{
		obj.display(email);
		}
		else
		{
			System.out.println("Registration is not Successful");
		}
	
		
	}
}
class Login{

	public void display(String email) {
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to login");
		System.out.println("Enter user name");
		System.out.println(email);
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
	 System.out.println("Enter the Password");
			String password=s.next();
			Matcher passwordmatch=pswNamePtrn.matcher(password);
			if(passwordmatch.matches())
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Invalid ");
			}
		
	}
	
}
