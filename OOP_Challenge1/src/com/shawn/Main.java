package com.shawn;

public class Main {

    public static void main(String[] args) {
        Account shawnAccount=new Account();

        //we can also get the account information of shawn by setting the value of the fields by the setters and getters method
        /*shawnAccount.setNumber(123456);
        shawnAccount.setBalance(431.00);
        shawnAccount.setHolderName("shawn");
        shawnAccount.setHolderMail("shawn@gmail.com");
        shawnAccount.setHolderPhone("+88012334");

        System.out.println("account name is "+shawnAccount.getHolderName());*/
        //calling the methods
        /*shawnAccount.depositMoney(20);
        shawnAccount.withdrawalMoney(20);
        shawnAccount.withdrawalMoney(100);
        shawnAccount.depositMoney(1000);
        shawnAccount.withdrawalMoney(569);*/

        VipPerson shawn=new VipPerson();
        System.out.println(shawn.getName());

        VipPerson imran=new VipPerson("imran",45000);
        System.out.println(imran.getName());

        VipPerson shamim=new VipPerson("shamim",75000,"shamim@gmail.com");
        System.out.println(shamim.getName());

    }
}
