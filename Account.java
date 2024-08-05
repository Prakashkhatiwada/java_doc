class Account {
    protected int pin;
    protected double balance;

    public Account(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int pin, double balance, double interestRate) {
        super(pin, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public void calculateInterest() {
        interestRate = balance * interestRate;
        deposit(interestRate);
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int pin, double balance, double overdraftLimit) {
        super(pin, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }
}

// Example usage
public class BankingSystem {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1234, 1000, 0.01);
        savings.deposit(500);
        savings.calculateInterest();
        System.out.println("Savings balance: $" + savings.getBalance());

        CheckingAccount checking = new CheckingAccount(4321, 500, 100);
        checking.withdraw(600);
        System.out.println("Checking balance: $" + checking.getBalance());
    }
}
