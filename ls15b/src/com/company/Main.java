package com.company;
import java.util.Scanner;

public class Main {

    public static <Var> void main(String[] args) {


        Scanner namee = new Scanner(System.in);
        System.out.print("What is your name : ");
        String name = namee.nextLine();

        Scanner money = new Scanner(System.in);
        System.out.print("How much money do you have : ");
        double balance = money.nextDouble();
        BankAccount account = new BankAccount(name,balance);
        Scanner depo = new Scanner(System.in);
        System.out.print("How much money do you want to deposit : ");
        account.deposit(depo.nextDouble());


        Scanner with = new Scanner(System.in);
        System.out.print("How much money do you want to withdraw : ");
        account.withdraw(with.nextDouble());

        var fibalance = account.balance;

        System.out.print("In the account : " +name+ "\nYour balance is : " +fibalance);



    }
}
