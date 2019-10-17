package com.shawn;

public class Audi_R8 extends Car {
    //declaring the variables that audi r8 only has
    private int roadServiceMonth;

    public Audi_R8(int roadServiceMonth) {
        super("Audi R8", "4WD", 80, 5, 4, 4, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    //creating a new method for acceleration of audi r8
    public void accelerate(int rate)
    {
        int newVelocity=getCurrentVelocity()+rate;

        if (newVelocity==0)
        {
            stop();
            changeGear(1);
        }else if (newVelocity>0 && newVelocity<=10)
        {
            changeGear(1);
        }else if (newVelocity>10 && newVelocity<=20)
        {
            changeGear(2);
        }else if (newVelocity>20 && newVelocity<=30)
        {
            changeGear(3);
        }else {
            changeGear(4);
        }

        if (newVelocity>0)
        {
            changeVelocity(newVelocity,getCurrentDirection());
        }

    }
}
