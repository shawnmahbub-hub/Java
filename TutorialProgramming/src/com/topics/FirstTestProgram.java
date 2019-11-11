package com.topics;

public class FirstTestProgram {

    int instancVariable=10;
    static int staticVariable=48;

    //static method
    public static void StaticTest()
    {
        System.out.println("this is a static method");
    }

    //non-static method
    public void NonStaticTest()
    {
        System.out.println("this is a non static method");
    }

    public static int Sum()
    {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }


    //main method
    public static void main(String[] args){
        System.out.println("Hello world!!!!");
        StaticTest();

        FirstTestProgram obj1=new FirstTestProgram();
        obj1.NonStaticTest();

        int sum=Sum();
        //obj1.instanceVariable=30;
        sum= obj1.instancVariable;
        System.out.println("sum is: "+ (sum+ staticVariable));
        double d=3.9;
        int i=(int) d;
        System.out.println(i);
        d=i;
        System.out.println(d);
        char c='*';
        i=c;
        d=c;
        i=(int) d+i;
        System.out.println(i);

        String string= "My name is Shawn, I'm practicing Java code now";
        System.out.println(string);

    }
}
