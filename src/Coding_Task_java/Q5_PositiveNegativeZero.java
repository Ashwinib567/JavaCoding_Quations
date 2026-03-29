package Coding_Task_java;

import java.util.Scanner;

public class Q5_PositiveNegativeZero {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scan.nextInt();

        System.out.println(num < 0 ? "Numner is negative" : (num == 0)? "Number is Zero" : "Number is positive");
        scan.close();
    }
}
