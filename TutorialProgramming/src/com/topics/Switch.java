package com.topics;

public class Switch {

    public static void main(String[] args) {
        /*
        Here we will be covering switch-case topic of Java

        switch take the variable or expression inside it's closure
        and then match with the case
        if it matched with the case then it will execute the code inside the case statement

        let's check
         */
        int number=5;
        char ch='a';
        switch (number)
        {
            case 2:
                System.out.println("case 2 is executed");
                break;

            case 5:
                System.out.println("case 5 is executed");
                number=number*number;
                System.out.println(number+ " after the multiplication");
                break;

            case 4:
                System.out.println("case 4 is executed");
                break;

            default:
                System.out.println("default is executed");

        }

        switch (ch) {
            case 'b':
                System.out.println("it is case 'b' ");
                break;
            case 'c':
                System.out.println("it is case 'c' ");
                break;

            case 'a':
                System.out.println("it is case 'a' ");
                break;
            default:
                System.out.println("it is the default case");
        }

        //now it's challenge time
        // please go to the com.challenges package to find the challenge
    }
}
