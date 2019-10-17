package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        dayOfTheWeek(0);
        dayOfTheWeek(1);
        dayOfTheWeek(2);
        dayOfTheWeek(3);
        dayOfTheWeek(4);
        dayOfTheWeek(5);
        dayOfTheWeek(6);
    }

    public static void dayOfTheWeek(int day)
    {
        switch (day){
            case 0:
                System.out.println("Today is Saturday");
                break;

            case 1:
                System.out.println("Today is sunday");
                break;

            case 2:
                System.out.println("Today is monday");
                break;

            case 3:
                System.out.println("Today is tuesday");
                break;

            case 4:
                System.out.println("Today is wednesday");
                break;

            case 5:
                System.out.println("Today is thursday");
                break;

            case 6:
                System.out.println("Today is friday");
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
