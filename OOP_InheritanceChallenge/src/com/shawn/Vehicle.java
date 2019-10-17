package com.shawn;

public class Vehicle {
    //declaring variables that all vehicles should have
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
        this.name = name;
        this.size = size;

        //current velocity and current direction that one vehicle should have
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    //this method for the field of steering of a vehicle
    public void steering(int direction)
    {
        this.currentDirection +=direction;
        System.out.println("vehicle.steering(): steering at "+this.currentDirection+"degrees." );
    }

    //method for moving field of a vehicle
    public void moving(int velocity, int direction)
    {
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("vehicle.moving(): moving at "+currentVelocity+" speed & steering in the direction of "+currentDirection);
        System.out.println("********************************************");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
    //method for stop the vehicle

    public void stop()
    {
        this.currentVelocity=0;
    }
}
