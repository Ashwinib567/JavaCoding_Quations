package Coding_Task_java;

public class Q13_Continue {

    public static void main(String[] args)
    {
        int i =1;
        for(i=1; i<= 10; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println("i :"+i);
        }
    }
}
