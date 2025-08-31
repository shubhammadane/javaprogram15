package com.shubham.SimpleIfProgram;
import java.util.Scanner;
class EvenOdd 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();//3
        
        
        if(n % 2 == 0)
            System.out.println("Even");
        if(n % 2 != 0)
            System.out.println("Odd");
    }
}
