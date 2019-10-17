package com.shawn;

import static com.shawn.Shawn.eat;

import static com.shawn.Shawn1.eat;

public class Main {

    public static void main(String[] args) {
	Shawn obj1= new Shawn(2, "Shawn");
        System.out.println(obj1.x+" "+obj1.name);
        //obj1.getName();
        System.out.println(obj1.getName());

        System.out.println(Shawn.eat());
        System.out.println(Shawn.eat());
        System.out.println(Shawn.array[0]);
    }
}
