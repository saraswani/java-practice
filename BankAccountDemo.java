
class BankAccount {
    String accountHolderName;
    long accountNumber;
    double balance;

    static int totalAccounts = 0;

    BankAccount(String accountHolderName,
                long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    void displayInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("-------------------------");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a1 =
            new BankAccount("Rahul", 10001, 15000);
        BankAccount a2 =
            new BankAccount("Priya", 10002, 25000);
        BankAccount a3 =
            new BankAccount("Amit", 10003, 18000);

        System.out.println("BANK ACCOUNT DETAILS");
        System.out.println("====================");

        a1.displayInfo();
        a2.displayInfo();
        a3.displayInfo();

        System.out.println("Total Accounts Created: "
                           + BankAccount.totalAccounts);
    }
}
