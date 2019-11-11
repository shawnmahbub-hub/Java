package com.shawn;

public class Operators {

    public static void main (String[] args){

        /*there are many kinds of operations that we can do in java
        .we will do it sequentially
        1.unary operation   2. Arithmetic operation     3. Shift operation
            .prefix
            .postfix                .multiplicative         .shift
                                    .additive

        4. Relational operations    5. Bitwise operations
            .comparison                 .bitwise AND
            .equality                   .bitwise exclusive OR
                                        .bitwise inclusive OR
        6. Logical operations
            . AND
            . OR
        7. Ternary operations
            . Ternary
        8. Assignment operations
            . assignment
         */

        //1.unary operation
        int x=10;
        x++;//post fix operation
        x =x+13;
        System.out.println(x);
        //prefix operation
        ++x;
        System.out.println(x);
        boolean bln= true;
        boolean d= !bln;
        System.out.println(d);

        //2. Arithmetic operation

        //additive
        int i1=10;
        i1= 10+10;
        System.out.println(i1);
        i1=30-i1;
        //multiplicative
        int i2=i1*i1;
        float i3= 155/Float.valueOf(i1);
        int i4=155%i1;
        System.out.println("multiplication: "+ i2+ " division: "+ i3+ " modulas: "+ i4);

        //3. Shift operation
        /*when do shift operation it will do the following steps
            .first it will convert the number to binary
            .then it will shift the value to 2 bits in the left if it is 2-bit shift & vice verca
            .then it will convert number again to decimal from binary
         */
        int a=30;//step1: 30=(binary)>==00011110
        a=a<<2;//step2: 01111000
        System.out.println(a);//step3: 01111000=120
        a=a>>3;
        System.out.println(a);//right shift: 01111000=00001111=15

        //4.relational operation
        if (a>i1)
        {
            System.out.println("a is greater than i1");
        }else if (a<i1)
        {
            System.out.println("a is less than i1");
        }else if (a<=i1)
        {
            System.out.println("either a is smaller than i1 or equal");
        }else if (a>=i1){
            System.out.println("either a is greater than i1 or equal");
        }else if (i1==i4)
        {
            System.out.println("i1 is equal to i4");
        }
        if (i1!=i4)
        {
            System.out.println("i1 is not equal to i4");
        }

        //5.Assignment operation
        int y=20;
        y+=i1;
        i1 -=i4;
        i2 *=i1;
        i3 /=i2;
        i4 %=i3;
        System.out.println(y+" i1:"+i1+" i2: "+i2+" i3: "+i3+" i4: "+i4);

        //6.Ternary operation
        /* it is work like if condition
        if the condition is true it will assign the first value else it will assign the second value
         */
        int ter=i1<i2?100:23;
        System.out.println(ter);//it will assign 100 as i1 is less than i2
        ter=i1>i2?100:23;
        System.out.println(ter);//as i1!> i2, so it will assign 23 to ter variable as literal

        //7.Logical operation
        if (i1<i2 && ter>i1)
        {
            System.out.println("The key to success is hard work");
        }
        if (i1>i2 || ter>i3)
        {
            System.out.println("with your hard work, you need to plan and organize --");
        }

    }
}
