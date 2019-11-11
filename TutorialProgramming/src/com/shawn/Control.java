package com.shawn;

import java.util.Scanner;

public class Control {

    public static void main(String[] args)
    {
        /*Here we will be covering four control statement
        1.if
        2.nested if statement
        3.if-else statement
        4.if-else-if statement
         */

        //if statement
        int number=120;
        if (number>=100)//if the condition inside the bracket is true then it will the if closure
        {
            System.out.println(number+" is greater or equal than 100");
        }

        //nested if statement
        int number2=70;
        if (number2<100){//if the number 2 is less than 100 than it will enter the if closure
            System.out.println(number2+" is less than 100");
            if (number2>50){//if the number 2 is greater than 50 than it will enter the nested if closure
                System.out.println(number2+" is greater than 50");
            }
        }

        //if-else statement

        /*here if one condition is true than it will enter
        the if closure, if it is not true than it will enter the
        else closure
         */

        float number3= 99.5f;
        if (number3>100)//in this it is true
        {
            System.out.println(number3+ " the number 3 is greater than 100");
        }else {
            System.out.println(number3+ " the number3 is less or equal than 100");
        }

        System.out.println("----------------------------------------------------------");

        //if-else-if statement

        Scanner sc=new Scanner(System.in);
        System.out.println("Please give a number to check it's digit!");
        int number4=sc.nextInt();
        //we will be checking how many digit/s the number have/s
        if (number4<100 && number4>=10)
        {
            System.out.println("The number4 is a two digit number");
        }else if (number4<1000 && number4>100)
        {
            System.out.println("The number is a three digit number");
        }else if (number4<10000 && number4>1000)
        {
            System.out.println("The number is a four digit number");
        }else if (number4<100000 && number4>10000)
        {
            System.out.println("The number is a five digit number");
        }else {
            System.out.println("Either the number is 1 digit number or the number is not between the range of 10-99_999");
        }


    }
}
