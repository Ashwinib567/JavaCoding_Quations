package Coding_Task_java;

import java.util.Scanner;

public class Q2_Even_odd
{
    public static void main(String[] args) {
        System.out.println("Number is number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number is Even");
        } else
        {
            System.out.println("Number is odd");
        }
        scan.close();
    }
}
