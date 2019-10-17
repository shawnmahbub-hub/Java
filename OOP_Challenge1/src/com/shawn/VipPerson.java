package com.shawn;

public class VipPerson {

    private String name;
    private double creditLimit;
    private String email;

    public VipPerson() {
        this("default name",50000.00,"sawon@gmail.com");

    }

    public VipPerson(String name, double creditLimit) {
        this(name,creditLimit,"imran@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
