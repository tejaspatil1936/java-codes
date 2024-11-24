class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        System.out.println("Account created for " + accountHolderName + " with account number: " + accountNumber + " and initial balance: $" + initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal of $" + amount + " from account " + accountNumber);
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
        System.out.println("Savings account created for " + accountHolderName + " with interest rate: " + interestRate + "%");
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest of $" + interest + " added to account " + getAccountNumber() + ". New balance: $" + getBalance());
    }
}

class Bank {
    public void displayAccountDetails(BankAccount account) {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("-----------------------\n");
    }
}

abstract class Loan {
    protected double loanAmount;
    protected double interestRate;

    public Loan(double loanAmount, double interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public abstract double calculateRepaymentAmount();
}

class HomeLoan extends Loan {
    public HomeLoan(double loanAmount, double interestRate) {
        super(loanAmount, interestRate);
        System.out.println("Home loan created with loan amount: $" + loanAmount + " and interest rate: " + interestRate + "%");
    }

    @Override
    public double calculateRepaymentAmount() {
        return loanAmount + (loanAmount * interestRate / 100);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("=== Bank System Simulation ===\n");

        BankAccount account = new BankAccount("123456789", "Tejas Patil", 1000);
        account.deposit(500);
        account.withdraw(200);

        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Shashank Patil", 2000, 5);
        savingsAccount.addInterest();

        Bank bank = new Bank();
        bank.displayAccountDetails(account);
        bank.displayAccountDetails(savingsAccount);

        Loan homeLoan = new HomeLoan(50000, 3.5);
        System.out.println("Home Loan Repayment Amount: $" + homeLoan.calculateRepaymentAmount());

        System.out.println("\n=== End of Simulation ===");
    }
}
