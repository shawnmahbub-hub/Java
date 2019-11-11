package com.topics;

public class For {

    public static void main(String[] args) {

        //we will do a simple for loop in the first try
        for (int i=1;i<=10;i++){
            System.out.print(" "+i);
        }

        //fun part: we will be doing an infinite for loop here
        //where the condition of false will never come

        //for (int i=1;i>=1;i++)
        //{
          //  System.out.println(i);
        //}\
        System.out.println();
        System.out.println("//////////////////////////////////////////////////////////");

        //now we will do a for loop using an array
        int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

        for (int i=1;i<=array.length;i++){
            System.out.print(" "+i);
        }
        System.out.println();

        //enhanced for loop
        for (int number: array)
        {
            System.out.println(number);
            System.out.print(".......................................");
            System.out.println(number);
        }

        for (int i=1;i<=array.length;i++){
            System.out.print(" "+i);
        }
        System.out.println();



    }
}
