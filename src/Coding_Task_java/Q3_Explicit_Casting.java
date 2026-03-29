package Coding_Task_java;

import java.util.Scanner;

public class Q3_Explicit_Casting {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        double d = scan.nextInt();
        int i = (int)d ;

        System.out.println("Double Value: "+d);
        System.out.println("Int value :" +i);
        scan.close();
    }
}
