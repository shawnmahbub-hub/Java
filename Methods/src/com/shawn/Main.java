package com.shawn;

public class Main {

    public static void main(String[] args)
    {


        //calling the methods
        calculateScore(true, 800, 5, 100);

        //calling the method again with a new parameter value
        calculateScore(true,10000, 8,100);

        //calling the second method which will return some values
        int highScore=calculateScore2(true, 800,5,100);
        System.out.println("buddy you have scored:" + highScore);

        int highScore2=calculateScore2(true, 10000,8, 100);
        System.out.println("mike, you have scored"+highScore2);


    }

    //we will create new method for calculating scores
    public static void calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus)
    {
        if(isGameOver==true)
        {
            int newfinalScore=score+(levelCompleted*bonus);
            newfinalScore +=2000;
            System.out.println("New Final Score: "+ newfinalScore);
        }
    }

    public static int calculateScore2(boolean isGameOver, int score, int levelCompleted, int bonus)
    {
        if(isGameOver==true)
        {
            int newfinalScore=score+(levelCompleted*bonus);
            newfinalScore +=2000;
            return newfinalScore;
        }else {
            return -1;
        }
    }
}
