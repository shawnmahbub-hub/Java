package com.challenges;

import java.util.Scanner;

public class Swap {

    public void swap(int x, int y){
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("X:"+ x+", "+"Y:"+y);

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Input Number X:");
        int x= sc.nextInt();
        System.out.println("Please Input Number Y: ");
        int y=sc.nextInt();
        Swap obj=new Swap();
        obj.swap(x,y);

    }
}
