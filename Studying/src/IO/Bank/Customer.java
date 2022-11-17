package IO.Bank;

public class Customer {

    double balance;
    String name;

    public Customer(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    public String toString(){
        return new String("Customer name - " + name + "\n" +
                          "Account balance = " + balance);
    }
}
