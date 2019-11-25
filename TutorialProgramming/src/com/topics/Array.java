package com.topics;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        //I will first try to initialize the array in two different ways
        //first one
        //in this step I just initialize the array of length 5
        //now I'll assign the value inside the array
        int a[]= {1, 2, 3, 4, 5}; //this is a single dimensional array


        for (int i=0; i<a.length;i++)
        {
            System.out.println("The value of the array is: "+ a[i]);
        }

        //now we need to initialize a multidimensional array
        int b[][]= {
                {1,3},//row 0
                {2,4},//row 1
                {3,4}// row 2
        };/*this is an example of multi dimensional array
            here I declared 3 rows and 2 columns of data inside the array*/

        System.out.println(".......................................................");

        //let's find the length of the first row and it will give the output of length 2 as there is only 2 indexes of value inside the row 0
        System.out.println("The length of the first row is: "+ b[0].length);

        System.out.println(".......................................................");

        for (int i=0; i<=2;i++){
           for (int j=0; j<2;j++)
           {
                System.out.println("The value of array index [ "+i+" ]"+"[ "+j+" ]: "+(b[i][j]));
            }
           System.out.println();
        }//this is the for loop method for printing the value of multidimensional array

        System.out.println("The values of the multidimensional array: "+ Arrays.deepToString(b));//this is simple method to print the multidimensional array which
                                                    //use the deepToString() method to invoke the value of the array
    }
}
