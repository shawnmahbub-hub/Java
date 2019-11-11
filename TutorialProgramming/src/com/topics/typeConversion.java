package com.topics;

public class typeConversion {

    public static void main(String [] args)
    {
        //string ot integer
        String s= "25";
        int num= Integer.valueOf(s);

        System.out.println(num);

        //s=Integer.toString(num);
        s=String.valueOf(num);
        System.out.println(s);

        //if we want to large space data type to less space data type we need to do it explicitly
        double d=45.99443643d;
        System.out.println("double is: "+ d);

        int i= (int) d;
        System.out.println("double in integer is: "+ i);

        double d_new= i;
        System.out.println("the new value of double is: "+ d_new);

        //long l= 4350453634646465435L;

        int i1=Integer.MAX_VALUE;
        System.out.println("Max value of integer is: "+ i1);

        long l=i1* 3_333_333_463_454L;
        System.out.println("long value after the multiplication is: "+ l);
        //int iNew= (int) l;
        //System.out.println("the integer value is: "+iNew);
    }

}
