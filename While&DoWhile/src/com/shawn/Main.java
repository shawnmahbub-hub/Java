package com.shawn;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishnumber = 20;
        int evenNumbersFound=0;

        //do while loop
        /*do {
            number++;
            if (!isEvenNumber(number))
            {
                continue;
            }
            evenNumbersFound++;
            System.out.println("even number= "+number);

        }while (number<=finishnumber);
        System.out.println("total even number= "+evenNumbersFound);*/

        //start the loop
        while (number <= finishnumber)
        {
            number++;
            if (!isEvenNumber(number))
            {
                continue;
            }
            evenNumbersFound++;
            if (evenNumbersFound>=5)
            {
                break;
            }
            System.out.println("Even Number= "+number);
        }
        System.out.println("the total number of even numbers is= "+evenNumbersFound);
    }

    public static boolean isEvenNumber(int number)
    {
        if (number%2==0)
        {
            return true;
        }
        return false;
    }
}
