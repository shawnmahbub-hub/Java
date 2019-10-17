package com.shawn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//taking input via scanner method

        //take some inputs from the user
        System.out.println("Enter your Birth year: ");

        boolean hasNextInt=scanner.hasNextInt();
        if (hasNextInt)
        {
            int birthYear=scanner.nextInt();
            scanner.nextLine();//handles the next line character


            System.out.println("Enter your name: ");
            String name=scanner.nextLine();

            int age=2019-birthYear;

            if (age>=0 && age<=100)
            {
                System.out.println("Your name is "+name+" and Your age is "+age);
            }else {
                System.out.println("Invalid birth year");
            }
        }else {
            System.out.println("Unable to parse the birth year");
        }








        scanner.close();

    }
}
