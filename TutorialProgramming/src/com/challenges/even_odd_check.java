package com.challenges;

import java.util.Scanner;

public class even_odd_check {

    private void checkMethod(long number){
        if (number%2 ==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        //in this challenge we need to check whether the number is even or odd.
        //we will doing this challenge in two way
        /*1.assign the number manually
          2. take an input number from the user
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input a number to check!");
        long number=sc.nextLong();

        even_odd_check obj1=new even_odd_check();
        obj1.checkMethod(number);


    }
}
