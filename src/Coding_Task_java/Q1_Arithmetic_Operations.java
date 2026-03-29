package Coding_Task_java;

import java.util.Scanner;

public class Q1_Arithmetic_Operations
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter firts number: ");
        int a = scan.nextInt();
        System.out.println("Enter Secound number: ");
        int b = scan.nextInt();

        System.out.println(" Addition of 2 number = " + (a+b));
        System.out.println(" difference of 2 number = " + (a-b));
        System.out.println(" multiplication of 2 number = " + (a*b));
        System.out.println(" Division of 2 number = " + (a/b));
        System.out.println(" Remainder of 2 number = " + (a%b));

        scan.close();
    }
}
