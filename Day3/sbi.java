package Day3;

class bank {
    void interest() {
        System.out.println("Bank provides interest on deposits");
    }

    void interest(double rate) {
        System.out.println("interest rate:" + rate);
    }
}

public class sbi extends bank {
    void interest(double rate, int years) {
        double total;
        double principle = 10000;
        total = (principle * rate * years) / 100;

        System.out.println(total);
    }

    public static void main(String[] args) {
        sbi ob = new sbi();
        ob.interest();
        ob.interest(8.3);
        ob.interest(8.3, 2);
    }

}
