package com.shawn;

public class Control {

    public int add(int a, int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args)
    {
          Control obj1=new Control();
        int addition=obj1.add(50,9453525);
        System.out.println("Addition: "+addition);
    }
}
