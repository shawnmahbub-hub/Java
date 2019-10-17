package com.shawn;

public class Main {

    public static void main(String[] args) {

        //declaring variable for the inputs
        boolean isGameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;

        // setting if else condition
        if (isGameOver==true)
        {
            int finalScore=score+(levelCompleted*bonus);
            System.out.println("Final Score: "+ finalScore);
        }

        //changing the values of previous variables to calculate new game over final score
        score=10000;
        levelCompleted=8;
        bonus=300;

        if(isGameOver==true)
        {
            int newfinalScore=score+(levelCompleted*bonus);
            newfinalScore +=2000;
            System.out.println("New Final Score: "+ newfinalScore);
        }
    }

}
