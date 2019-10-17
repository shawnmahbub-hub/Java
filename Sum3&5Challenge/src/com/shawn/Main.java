package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        int count=0;
        int sum=0;

        //now i'm calling the for loop to execute from 1 to 1000
        for (int i=1;i<=1000;i++)
        {
            if ((i%3==0)&&(i%5==0))
            {
                count++;
                sum +=i;
                System.out.println("the numbers are"+i);
            }
            if (count==5)
            {
                break;
            }
        }
        //printing the sum value
        System.out.println("sum= "+sum);
    }
}
