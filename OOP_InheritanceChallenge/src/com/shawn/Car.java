package com.shawn;

public class Car extends Vehicle
{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    public int currentGear;

    public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int doors, int gears, boolean isManual) {
        super(name, size, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setcurrentgear(): changed to "+this.currentGear+" gear" );
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("car.changevelocity: velocity "+speed+" direciton "+direction);
        moving(speed,direction);

    }
}
