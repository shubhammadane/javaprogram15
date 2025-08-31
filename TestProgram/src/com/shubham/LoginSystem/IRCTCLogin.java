package com.shubham.LoginSystem;

import java.util.Scanner;

public class IRCTCLogin 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
    String user,pass,cptcha;	
    
    System.out.println("Enter the userName: ");
    user = sc.nextLine();
    
    System.out.println("Enter the Password: ");
    pass = sc.nextLine();
    
    System.out.println("Enter the Captcha: ");
    cptcha = sc.nextLine();
    
    if(user.equals("shubham123"))
    {
    	if(pass.equals("shubham")) 
     {
    		
    		if(cptcha.equals("HA")) 
    		{
    			System.out.println("Welcome To IRCTC Login...");
    		}
    		else
    		{
    			System.out.println("Invalid Captcha");
    		}
    	 }
    	else
		{
			System.out.println("Invalid pass");
		}
    }
    else
	{
		System.out.println("Invalid User");
	}
}
}
