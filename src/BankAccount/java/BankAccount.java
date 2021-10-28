package BankAccount.java;

import BankAccount.java.Mybalance;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Mybalance Now=new Mybalance();
        Now.My();

        Scanner New= new Scanner(System.in);
        System.out.println("Enter your new balance");
        double BB=New.nextDouble();
        Now.Newbalance(BB);
        System.out.println("How much du you want to add?");
        double CC=New.nextDouble();
        Now.Add(CC);
      //  Now.Min(400);
        System.out.println("Your balance =" + Now.getBalance());












    }

}

