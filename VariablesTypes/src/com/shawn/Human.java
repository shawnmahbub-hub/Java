package com.shawn;

public class Human {

    String nirob="my name is nirob";
    public static int number=5;

    public static void main(String[] args)
    {
        Human arnab= new Human();
        Human imran= new Human();

        String shawn="my name is shawn";
        System.out.println(shawn);
        System.out.println(arnab.nirob);

        System.out.println(arnab.nirob);
        System.out.println(imran.nirob);

        arnab.nirob="your name should raja";
        imran.nirob="your name shoulb be rahmat";

        System.out.println(arnab.nirob);
        System.out.println(imran.nirob);
        System.out.println(number);
    }

    public int nirob()
    {
        System.out.println(number);
        return number;
    }
}
