package com.challenges;

import java.util.Scanner;

public class PositiveNegativeNumberCheck {

    private void checkMethod(int number)
    {
        if (number>0)
        {
            System.out.println("The given number is positive");
        }else if (number<0){
            System.out.println("The given number is negative");
        }else {
            System.out.println("Neither the given number is positive nor negative");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please input a number to check");
        int number= sc.nextInt();
        sc.close();

        PositiveNegativeNumberCheck obj1= new PositiveNegativeNumberCheck();
        obj1.checkMethod(number);
    }
}
