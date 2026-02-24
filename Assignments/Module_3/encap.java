package Assignments.Module_3;

import Assignments.Module_1.primecheck;
import Day3.dog;

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withdrawn: " + amount);
        } else
            System.out.println("insufficient balance");
    }

    public double getbalance() {
        return balance;
    }
}

public class encap {
    public static void main(String[] args) {
        BankAccount ob = new BankAccount("123456789", 500);
        System.out.println("Current Balance: " + ob.getbalance());
        ob.deposit(500);
        System.out.println("Current Balance: " + ob.getbalance());
        ob.withdraw(300);
        System.out.println("Current Balance: " + ob.getbalance());
    }

}