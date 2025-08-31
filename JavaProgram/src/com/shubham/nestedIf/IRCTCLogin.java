package com.shubham.nestedIf;

import java.util.Scanner;

public class IRCTCLogin 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	String userId;
	String password;
	String captcha;
	
	System.out.println("Enter the User Id: ");
	userId=sc.nextLine();
	
	System.out.println("Enter the User Password: ");
	password=sc.nextLine();
	
	System.out.println("Enter the User Captcha: ");
	captcha=sc.nextLine();
	
	if(userId.equals("Shubham123"))
	{
		if(password.equals("Shubham@123")) 
		{
			if(captcha.equals("X32a")) 
			{
				System.out.println("Welcome to IRCTC Login....");

			}
			else
			{
				
				System.err.println("Plz enter the Correct Captcha....");

			}
			
		}
		else 
		{
			System.err.println("Plz enter the Correct Password....");

		}
	}
	else 
	{
		System.err.println("Plz enter the Correct userName....");
	}
	
	
}
}
