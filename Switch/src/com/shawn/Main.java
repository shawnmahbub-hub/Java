package com.shawn;

public class Main {

    public static void main(String[] args) {
        //In this part we will be doing switch statement

        //first initiate a variable to test
        int switchValue = 5;

        //initiating the switch statement
        switch (switchValue){
            case 1:
                System.out.println("Your given number is 1");
                break;

            case 2: case 3: case 4:
                System.out.println("Your given number is "+switchValue);
                break;

            default:
                System.out.println("The number you have given is "+ switchValue+",which is larger than 1,2,3,4");
                break;
        }

        //type 2

        String stringValue="Shawn";

        switch (stringValue.toLowerCase())
        {
            case "shawn":
                System.out.println(stringValue+" is found in case 1.");
                break;

            case "Shawn":
                System.out.println("The first letter is an uppercase letter");
                break;

            case "sHawn": case "shAwn": case "shaWn":
                System.out.println("there exist at least one uppercase letter");
                break;

            default:
                System.out.println("not found");
                break;
        }
        System.out.println("thank you!!!");
    }
}
