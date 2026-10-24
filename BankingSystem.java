
class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(long accountNumber, String accountHolderName,
                double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        setBalance(balance);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            accountHolderName = name;
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    void displayDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: Rs. " + getBalance());
    }
}

abstract class Account {
    abstract void calculateInterest();

    void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class SavingsAccount extends Account {
    double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Annual Interest at 4%: Rs. "
                           + interest);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("ENCAPSULATION");
        System.out.println("=============");

        BankAccount account =
            new BankAccount(50001, "Rahul", 20000);

        account.displayDetails();

        account.setAccountHolderName("Rahul Sharma");
        account.setBalance(25000);

        System.out.println("\nAfter Updating Account:");
        account.displayDetails();

        System.out.println("\nABSTRACTION");
        System.out.println("===========");

        Account savings = new SavingsAccount(25000);
        savings.showAccountType();
        savings.calculateInterest();
    }
}
