package com.company;
public class BankAccount {
    public double balance;
    public String name;

    public BankAccount(String name, Double balance) {
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double d)
    {
        balance = balance + d;

    }
    public void withdraw(double w)
    {
        balance = balance - w;

    }





}
