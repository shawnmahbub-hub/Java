package com.challenges;

public class Fibonacci_Series {

    public static void main(String[] args) {
        int count=9;
        int num1=0;
        int num2=1;
        System.out.print("fibonacci Series of count "+count+" is: ");

        //using for loop
        /*for (int i=1;i<=count;++i){

            System.out.print(num1+" ");

            int sum_of_prev_two=num1+num2;
            num1=num2;
            num2=sum_of_prev_two;
        }*/

        //System.out.println();

        //using while loop
        /*int i=1;
        while (i<=count){

            System.out.print(num1+" ");

            int sum_of_prev_two=num1+num2;
            num1=num2;
            num2=sum_of_prev_two;
            ++i;
        }*/

        //using do while loop
        int i=1;
        do{

            System.out.print(num1+" ");

            int sum_of_prev_two=num1+num2;
            num1=num2;
            num2=sum_of_prev_two;
            ++i;
        }while (i<=count);
    }
}
