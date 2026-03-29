package Coding_Task_java;

import java.util.Scanner;

public class Q7_Calculator {
    public static void main(String[] args)
    {
        System.out.println("-----------Calculator Program---------");

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1. Addition \n 2.Substarction  \n 3.Multiplication \n 4. Division");
        System.out.println(" \n Enter Your Choise: ");
        int cal = scan.nextInt();

        System.out.println("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = scan.nextInt();

        switch (cal)
        {
            case 1:
                System.out.println(" Addition of two number " +num1+ " and " +num2+ " is: " +(num1+num2));
                break;
            case 2:
                System.out.println(" Substraction of two number " +num1+ " and " +num2+ " is: " +(num1-num2));
                break;
            case 3:
                System.out.println(" Multiplication of two number " +num1+ " and " +num2+ " is: " +(num1*num2));
                break;
            case 4:
                System.out.println(" Division of two number " +num1+ " and " +num2+ " is: " +(num1*num2));
                break;
            default:
                System.out.println("Enter valid number ");

        }


    }
}
