package Assignments.Module_4;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {// Credit Card class
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment implements Payment {// UPI class
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class p2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();// Credit Card class
        Payment p2 = new UPIPayment();// UPI class

        p1.pay(1000);
        p2.pay(500);
    }
}
