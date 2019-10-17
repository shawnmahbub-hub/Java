package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        //defining a data type of string
        String myString="This my string";
        System.out.println("String: "+ myString);

        //add string with another string
        myString=myString+", This is the another string.";
        System.out.println("String: "+ myString);

        //add string with a unicode character
        char myChar='\uA009';
        System.out.println(myChar);
        myString=myString + myChar+ " 2019 ";
        System.out.println("String: "+ myString);

        //add a string with another number string
        String numString="234.232";
        myString=myString+numString;

        System.out.println("String: "+ myString);

        //add a string with int and double type of data
        int myInt=64;
        double myDouble=457.34d;
        myString=myString+myInt+myDouble;
        System.out.println("String: "+ myString);

    }
}
