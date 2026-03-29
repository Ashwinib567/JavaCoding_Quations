package Coding_Task_java;

import java.util.Scanner;

public class Q4_Max_Number {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter secound number: ");
        int num2 = scan.nextInt();

        int max = (num1 > num2 ? num1 : num2 );
        System.out.println(" maximum number from" +num1+" and " +num2+ " is: " +max);


    }
}
