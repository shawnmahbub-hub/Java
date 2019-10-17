package com.shawn;

public class Main {

    public static void main(String[] args)
    {
        //below way is the manual way to call the method again and again
        System.out.println("the interest rate of 10000 at 2% is = "+calculateInterestRate(10000, 2));
        System.out.println("the interest rate of 10000 at 3% is = "+calculateInterestRate(10000, 3));
        System.out.println("the interest rate of 10000 at 4% is = "+calculateInterestRate(10000, 4));
        System.out.println("the interest rate of 10000 at 5% is = "+calculateInterestRate(10000, 5));

        System.out.println("*******************");

        //now I'll use for loop to calculate the interest for 25 times
        for (int ir=1; ir<=25;ir++)
        {
            System.out.println("the interest rate of 10000 at "+ir+" % is = "+String.format("%.2f",(double)calculateInterestRate(10000, ir)));
        }

        System.out.println("*******************");

        //now printing the interest rate from 25 to 18%
        for (int ir=25; ir>=18;ir--)
        {
            System.out.println("the interest rate of 10000 at "+ir+" % is = "+String.format("%.2f",(double)calculateInterestRate(10000, ir)));
        }

        System.out.println("*******************");

        int count=0;

        for (int i=10;i<=50;i++)
        {
            if (isPrime(i))
            {
                count++;
                System.out.println("The number "+i+" is a prime number");
                if (count==10)
                {
                    System.out.println("exiting the loop");
                    break;
                }

            }
        }

    }

    //method for calculate the interest for the specific amount
    public static double calculateInterestRate(double amount, double interestRate)
    {
        return (amount*(interestRate/100));
    }

    //setting another method for another case
    public static boolean isPrime(int number)
    {
        if (number==1)
        {
            return false;
        }

        for (int i=2;i<=(long) Math.sqrt(number);i++)
        {
            System.out.println("looping till "+i);
            if (number%i==0)
            {
                return false;
            }

        }
        return true;
    }
}
