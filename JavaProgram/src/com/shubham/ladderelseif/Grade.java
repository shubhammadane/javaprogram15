package com.shubham.ladderelseif;

import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        if(m >= 90)
            System.out.println("Grade A+");
        else if(m >= 75)
            System.out.println("Grade A");
        else if(m >= 60)
            System.out.println("Grade B");
        else if(m >= 40)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}

