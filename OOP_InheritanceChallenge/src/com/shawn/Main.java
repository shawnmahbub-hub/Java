package com.shawn;

public class Main {

    public static void main(String[] args) {

        //this is the challenge time!!!
        //instructions
        /*start with a base class named vehicle
        * then create a car class that inherits from this base class
        * finally,create another class, a specific model of car that inherits from the car class
        * I should able to hand steering, changing gears, and moving (speed in other words)
        * I will want to decide where to put the appropriate state and behaviours(field and methods)
        * changing gears and increasing/decreasing speed should be included
        * i need to add a specific characteristic for the specific type of car*/

        Audi_R8 audi_r8=new Audi_R8(48);
        audi_r8.accelerate(30);
        audi_r8.accelerate(20);
        audi_r8.steering(45);

    }
}
