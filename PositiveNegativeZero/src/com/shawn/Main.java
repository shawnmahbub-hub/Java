package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        //calling the method
        checkResult(10);
        checkResult(-10);
        checkResult(0);
    }

    public static void checkResult(int number)
    {
        if (number>0)
        {
            System.out.println(number+" is positive");
        }else if (number<0){
            System.out.println(number+" is negative");
        }else {
            System.out.println(number+" is equal to zero");
        }
    }
}
