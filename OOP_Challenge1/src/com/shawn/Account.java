package com.shawn;

public class Account {
    //declaring fields of the account class
    private int number;
    private double balance;
    private String holderName;
    private String holderMail;
    private String holderPhone;

    public Account()
    {
        this(123456, 0.00, "shawn",  "shawn@gmail.com", "+88012352");
        System.out.println("empty method called");
    }

    public Account(int number, double balance, String holderName, String holderMail, String holderPhone)
    {
        System.out.println("method with parameter called");
        this.number=number;
        this.balance=balance;
        this.holderName=holderName;
        this.holderMail=holderMail;
        this.holderPhone=holderPhone;

        System.out.println("account number: "+number+" account name: "+holderName);
    }

    //now create two methods
    public void depositMoney(double depositMoney)//first method
    {
        this.balance +=depositMoney;
        System.out.println("Money depositing of the amount of "+this.balance+" processed. New Balance is: "+this.balance);
    }

    //second method
    public void withdrawalMoney(double withdrawMoney)
    {
        if (this.balance-withdrawMoney<0)
        {
            System.out.println("only "+ this.balance+" money availabe. Withdrawal of"+withdrawMoney+" can not be processed");
        }else {
            this.balance -=withdrawMoney;
            System.out.println(withdrawMoney+" has been deducted. New balance is  "+this.balance);
        }

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderMail() {
        return holderMail;
    }

    public void setHolderMail(String holderMail) {
        this.holderMail = holderMail;
    }

    public String getHolderPhone() {
        return holderPhone;
    }

    public void setHolderPhone(String holderPhone) {
        this.holderPhone = holderPhone;
    }
}
