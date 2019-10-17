package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        int myInt=1+2;
        System.out.println("Result: "+ myInt);

        //add operation
        int previous_result=myInt;
        myInt=myInt+5;
        System.out.println(previous_result+ "+5= "+ myInt);

        //subtraction operation
        previous_result=myInt;
        myInt=myInt-5;
        System.out.println(previous_result+ "-5= "+ myInt);

        //multiplication operation
        previous_result=myInt;
        myInt=myInt*5;
        System.out.println(previous_result+ "*5= "+ myInt);

        //division operation
        previous_result=myInt;
        myInt=myInt/5;
        System.out.println(previous_result+ "/5= "+ myInt);

        //remainder operation
        previous_result=myInt;
        myInt=myInt%5;
        System.out.println(previous_result+ "%5= "+ myInt);

        //++ or -- operation
        myInt++;
        System.out.println("myInt++ : "+ myInt);

        myInt--;
        System.out.println("myInt-- : "+ myInt);

        //+= or -= or *= or /= operation
        myInt+=5;
        System.out.println("myInt+=5: "+ myInt);

        myInt-=5;
        System.out.println("myInt-=5: "+ myInt);

        myInt*=5;
        System.out.println("myInt*=5: "+ myInt);

        myInt/=5;
        System.out.println("myInt/=5: "+ myInt);

        //== or && or || or >= or <= or != operation
        boolean isAlien=false;
        if (isAlien==false)
        {
            System.out.println("Messi is from another planet");
        }

        int Current_goal=620;
        int club_goal=600;

        if(Current_goal==620)
        {
            System.out.println("THis is the number of goal messi scored: "+ Current_goal);
        }
        if (Current_goal!=club_goal)
        {
            System.out.println("This is correct");
        }
        if (Current_goal>=club_goal && Current_goal<=700)
        {
            System.out.println("Messi is the highest scorer of all time");
        }
        if (club_goal<=600 || club_goal!=500)
        {
            System.out.println("Ronaldo and Messi is the highest club goal scorer of all time");
        }

        /**
         * challenge time!!!
         * create double variable with the value 20
         * create double variable with the value 80
         * add both the numbers and multiply with the 25 and find out the remainder and store it to a new variable
         * if the remainder is equal or less than 20 print the remainder is over the limit
         */

        double firstNum=20d;
        double secondNum=80d;
        double myTotal=(firstNum+secondNum)* 25;
        System.out.println("Total: "+ myTotal);
        double Remainder=myTotal%40;
        System.out.println("Remainder: "+ Remainder);

        if(Remainder<=20)
        {
            System.out.println("Remainder is over the limit");
        }

    }
}
