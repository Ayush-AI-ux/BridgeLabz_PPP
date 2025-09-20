class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account - Maturity Period: " + maturityPeriod + " years");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount(101, 20000, 5);
        BankAccount b2 = new CheckingAccount(102, 15000, 5000);
        BankAccount b3 = new FixedDepositAccount(103, 50000, 5);

        ((SavingsAccount)b1).displayAccountType();
        ((CheckingAccount)b2).displayAccountType();
        ((FixedDepositAccount)b3).displayAccountType();
    }
}
