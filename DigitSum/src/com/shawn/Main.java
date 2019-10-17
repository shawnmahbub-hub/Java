package com.shawn;

public class Main {

    public static void main(String[] args) {



        for (int i=15; i<250; i+=25)
        {
            System.out.println("The sum of digits of the given number "+i+" is= "+digitSum(i));
        }


    }

    //declaring a method for calculating the sum of the digits of a given number
    private static int digitSum(int number)
    {
        if (number<10)
        {
            return -1;
        }

        int digit=0;
        int sum=0;

        while (number>0)
        {
            digit=number%10;//extract the LSB from here
            sum +=digit; //set the digit here one by one

            //now calculate for the remaining digits
            number /=10;
        }
        return sum;
    }
}
