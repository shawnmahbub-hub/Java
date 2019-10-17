package com.shawn;

public class Main {

    public static void main(String[] args) {
        String numberAsString="2018.125";
        System.out.println("The number as string is= "+numberAsString);

        /*int number=Integer.parseInt(numberAsString);
        System.out.println("Number= "+number);*/

        double newNumber=Double.parseDouble(numberAsString);
        System.out.println("Double Number= "+newNumber);

        //add some values
        numberAsString +=1;
        //number +=1;
        newNumber +=1;

        System.out.println("String Number= "+numberAsString+", Double Number= "+newNumber);
    }
}
