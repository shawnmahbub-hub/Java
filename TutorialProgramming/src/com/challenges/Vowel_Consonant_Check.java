package com.challenges;

import java.util.Scanner;

public class Vowel_Consonant_Check {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character: ");
        boolean isVowel=false;
        char ch=sc.next().charAt(0);
        sc.close();

        switch (ch){

            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

            case 'A':

            case 'E':

            case 'I':

            case 'O':

            case 'U': isVowel=true;
        }

        if (isVowel==true)
        {
            System.out.println(ch+ " is a vowel.");
        }else if ( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
            System.out.println(ch+ " is a consonant.");
        }else {
            System.out.println(ch+ " is not an alphabet.");
        }

    }
}
