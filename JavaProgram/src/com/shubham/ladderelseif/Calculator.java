package com.shubham.ladderelseif;

import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        if(op == '+')
            System.out.println("Sum = " + (a+b));
        else if(op == '-')
            System.out.println("Difference = " + (a-b));
        else if(op == '*')
            System.out.println("Product = " + (a*b));
        else if(op == '/')
            System.out.println("Quotient = " + (a/b));
        else
            System.out.println("Invalid Operator");
    }
}
