package com.shawn;

public class ByteIntShortLong_DataTypes {

    public static void main(String[] args)
    {
        //defining the byte type of variable
        byte myByteValue=-128;//byte has width of 8
        System.out.println("Byte Value: "+ myByteValue);

        //casting via expression
        byte myByteTotal= (byte) (myByteValue/2);
        System.out.println("myByteTotal: "+ myByteTotal);

        //defining the Int type of variable which has a width of 32
        int myMinIntValue=-2147483648;
        int myMaxIntValue=2147483647;
        System.out.println("My Integer total: "+ (myMaxIntValue/2));

        //defining the short type of variable which has a width of 16
        short myShortValue = 32767;
        short myShortTotal= (short) (myShortValue/2);
        System.out.println("Short Value: "+myShortTotal);

        //defining the long type of variable which has a width of 64
        long myLongValue=9223372036854775807L;
        System.out.println("Long Value: "+ myLongValue);

        /**challenge part

        1. Create a byte variable and set it to any valid byte number.
        2. Create a short variable and set it to any valid short number.
        3. Create a int variable and set it to any valid in number.
        4. Create a variable of type long, and make it equal to
        5.  50000 + 10 times the sum of the byte, plus the short plus the int*/

        byte myByteVar=63;//p-1
        short myShortVar=15343;//p-2
        int myIntVar=23242;//p-3

        //part-4+5
        long MyLongVar=50000L+(10L*(myByteVar+myShortVar+myIntVar));
        System.out.println("Result: "+ MyLongVar);

    }
}
