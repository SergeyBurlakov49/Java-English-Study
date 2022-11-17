package IO.Bank;

public class Customer {

    float balance;
    String name;

    public Customer(float balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    public String toString(){
        return new String("Customer name - " + name + "\n" +
                          "Account balance = " + balance);
    }
}
