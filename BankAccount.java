package Bank;

public class BankAccount {

    private String owner;
    private double balance;


    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) throws InsufficientFunds {
        if (amount > balance) {
            throw new InsufficientFunds("Attempt to withdraw $" + amount + " with balance $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount + ". New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }


    public String getOwner() {
        return owner;
    }
}
