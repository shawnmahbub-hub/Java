package com.shawn;

public class Char_boolean_dataTypes {

    public static void main(String[] args)
    {
        //defining variabel for char types of data
        char myChar='\u00A9';
        System.out.println("unicode symbol: "+myChar);

        //defining variabel for boolean types of data
        int num=5;
        int x=9;

        boolean a=true;
        boolean b=false;

        //setting a condition for printing the right value of boolean
        if (x>num)
        {
            System.out.println("The number is larger than num: "+a);
        }
        else {
            System.out.println("The number is smaller than num: "+ b);
        }

        /**
         * find unicode for registered symbol as like the copyright symbol
         * define a char variable and assign the unicode to that identifiers
         * show the output
         */

        char registered_symbol='\u00AE';
        System.out.println("Registered Symbol: "+ registered_symbol);

    }
}
