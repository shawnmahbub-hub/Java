package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        calcFeetAndInches(5,8.5);//calling the first method
        calcFeetAndInches(68.5);//calling the second method
        System.out.println("Thank You!!!");
    }

    //first method
    public static double calcFeetAndInches(double feet, double inches)
    {
        if (feet<=0 ||(inches<=0 && inches>12))
        {
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeters=(feet*12)*2.54;//this is for the feet
        centimeters +=inches*2.54;//this is for the inches
        System.out.println(feet+ "ft"+inches+"in = "+centimeters+"cm");
        return centimeters;
    }

    //second method
    public static double calcFeetAndInches(double inches)
    {
        if (inches<0 && inches>12)
        {
            return -1;
        }

        double feet=(int)inches/12;
        double remainingInches=inches%12;
        System.out.println(inches+" inches="+feet+"ft "+remainingInches+"in");
        return calcFeetAndInches(feet,remainingInches);

    }
}
