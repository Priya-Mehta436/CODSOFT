package Project3;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs. " + amount);
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: Rs. " + amount);
            checkBalance();
        } else if (amount > balance) {
            System.out.println("Transaction failed! Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }

    public void checkBalance() {
        System.out.println(" Current Balance: Rs. " + balance);
    }
}
