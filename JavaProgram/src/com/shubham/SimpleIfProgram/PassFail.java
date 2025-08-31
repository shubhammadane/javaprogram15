package com.shubham.SimpleIfProgram;

import java.util.Scanner;
public class PassFail 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if(marks >= 40)
            System.out.println("Pass");
        if(marks < 40)
            System.out.println("Fail");
    }
}
