package com.shawn;

public class Float_Double_DataTypes {

    public static void main(String[] args)
    {
        // defining a integer type of variable to show the difference between float, double & integer
        int myIntValue= 5;
        System.out.println("Int Val: "+ myIntValue);
        float myFloatValue=5f;
        System.out.println("float Val: "+ myFloatValue);
        double myDoubleValue=5d;
        System.out.println("Double Val: "+ myDoubleValue);

        //divide every types of numbers with 3
        myIntValue=myIntValue/3;
        System.out.println("my new int value: "+ myIntValue);
        myFloatValue=myFloatValue/3f;
        System.out.println("my new float value: "+ myFloatValue);
        myDoubleValue=myDoubleValue/3d;
        System.out.println("my new double value: "+ myDoubleValue);

        double myNewDoubleValue=myDoubleValue+myFloatValue+myIntValue;
        System.out.println("my new double value: "+ myNewDoubleValue);

        /** challenge part
         * create a variable to store the number of pounds
         * calculate the number of kilograms for the given number of pounds and store it to a new variable
         * print out the result
         * notes: 1 pound=0.45359237
         */

        double pounds=185d;
        float kilograms= (float) (pounds*0.45359237f);
        System.out.println("Kilograms: "+ kilograms);

    }
}
