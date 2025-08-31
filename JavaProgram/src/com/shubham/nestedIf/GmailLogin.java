package com.shubham.nestedIf;

import java.util.Scanner;

public class GmailLogin 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	String mailId;
	String pass;
	
	System.out.println("Enter the email Id:");
	mailId=sc.nextLine();
	
	if(mailId.equals("shubhammadane003@gmail.com")) 
	{
		System.out.println("Enter the Password: ");
		pass= sc.nextLine();
		if(pass.equals("123")) 
		{
			System.out.println("Welcome to Gamil Login.....");
		}
		else 
		{
			System.out.println("Invalid Password..");
		}
	}
	else 
	{
		System.err.println("InValid Email id...");
	}
	
}
}
