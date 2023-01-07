package part2.ex2_5;

public class Account {
    private int id;
    private Customer customer2;
    private double balance = 0.0;

    public Account(int id, Customer customer2, double balance) {
        this.id = id;
        this.customer2 = customer2;
        this.balance = balance;
    }

    public Account(int id, Customer customer2) {
        this.id = id;
        this.customer2 = customer2;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer2.toString() + "balance=" + (double) Math.round(balance * 100.0) / 100.0;
    }

    public String getCustomerName() {
        return customer2.getName();
    }
}