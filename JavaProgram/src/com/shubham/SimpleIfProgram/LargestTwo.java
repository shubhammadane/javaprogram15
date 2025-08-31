package com.shubham.SimpleIfProgram;

import java.util.Scanner;
class LargestTwo 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
            System.out.println(a + " is greater");
        if(b > a)
            System.out.println(b + " is greater");
    }
}
