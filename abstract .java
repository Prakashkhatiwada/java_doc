public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract boolean deposit(double amount);

    public abstract boolean withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Invalid deposit amount");
            return false;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount");
            return false;
        }
    }

    public double calculateInterest() {
        return balance * (1 + interestRate);
    }

    public void applyInterest() {
        double interest = calculateInterest() - balance;
        deposit(interest);
    }
}

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Invalid deposit amount");
            return false;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        savingsAccount.deposit(500);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        savingsAccount.applyInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        checkingAccount.withdraw(1200);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());

        checkingAccount.withdraw(300);
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}