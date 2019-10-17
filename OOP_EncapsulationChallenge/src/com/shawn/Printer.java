package com.shawn;

public class Printer {

    //declaring the fields of the printer
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        //validation check for the toner level
        if (tonerLevel>-1 && tonerLevel<=100)
        {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel=-1;
        }

        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
        this.pagesPrinted=0;
    }

    //add methods for adding toner
    public int addToner(int tonerAmount)
    {
        //validation check whether it is exceeding the toner level of 100
        if (tonerAmount>0 && tonerAmount<=100)
        {
            if (this.tonerLevel+tonerAmount>100)
            {
                System.out.println("আপনি টোনার লেভেল অতিক্রম করে ফেলেছেন এবং এটা গ্রহণযোগ্য নয়।");
            }else if (this.tonerLevel+tonerAmount<=100)
            {
                this.tonerLevel +=tonerAmount;
            }
            return this.tonerLevel;
        }else{
            return -1;
        }

    }

    //method for counting the number of pages printed
    public int printPages(int pages)
    {
        int pagesToPrint=pages;
        if (this.isDuplex==true && this.tonerLevel<=100){
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println("ডুপ্লেক্স মোড এ প্রিন্ট হচ্ছে");
        }
        this.pagesPrinted +=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
