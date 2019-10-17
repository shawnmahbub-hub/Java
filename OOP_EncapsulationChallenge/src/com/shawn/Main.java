package com.shawn;

public class Main {

    public static void main(String[] args) {
        /*challenge instructions
        * create a class and demonstrate proper encapsulation techniques
        * the class will be called printer
        * it will simulate a real computer printer
        * it should have fields for the toner level, number of pages printed, and
         * also whether its a duplex printer(capable of printing both sides of the pages)
         * add methods to fill up the toner(upto max of 100%)
         * also add another method to simulate printing a page(which should increase the number of pages printed)
         * decide on the scope, whether to use constructors, add anything else you think is needed*/

        //calling the printer class via encapsulation
        Printer printer=new Printer(50,true);
        System.out.println("প্রাথমিক পেজ সংখ্যা= "+printer.getPagesPrinted());



        int pagesPrinted=printer.printPages(9);
        System.out.println("বর্তমান পেজ প্রিন্ট করেছেন = "+pagesPrinted+" এবং মোট পেজ প্রিন্ট করেছেন "+printer.getPagesPrinted());

        pagesPrinted=printer.printPages(9);
        System.out.println("বর্তমান পেজ প্রিন্ট করেছেন= "+pagesPrinted+" এবং মোট পেজ প্রিন্ট করেছেন "+printer.getPagesPrinted());

        int tonerLevel=printer.addToner(100);
        System.out.println("বর্তমান টোনার লেভেল= "+tonerLevel);

        int tonerAmount=printer.addToner(50);
        System.out.println("বর্তমান টোনার লেভেল= "+tonerAmount);

    }
}
