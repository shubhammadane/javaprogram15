package com.shubham.ifelse;

import java.util.Scanner;
class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n < 0)
            n = -n;
        else
            n = n;
        System.out.println("Absolute value = " + n);
    }
}
