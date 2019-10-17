package com.shawn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=0;
        int max=0;
        int counter=0;
        boolean flag=true;

        while (true)
        {
            System.out.println("Enter number: ");
            boolean isAnInt=scanner.hasNextInt();

            if (isAnInt)
            {
                int num=scanner.nextInt();
                counter++;
                if (flag)
                {
                    flag=false;
                    min=num;
                    max=num;
                }
                if (num>max)
                {
                    max=num;
                }else if (num<min)
                {
                    min=num;
                }
                if (counter==5)
                {
                    break;
                }


            }else {
                System.out.println("invalid input");
            }
            scanner.nextLine();
        }
        System.out.println("Max: "+max+" Min: "+min);

        scanner.close();
    }
}
