package com.shubham.ifelse;

import java.util.Scanner;
class Voting
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("Eligible to Vote");
        else
            System.out.println("Not Eligible");
    }
}
