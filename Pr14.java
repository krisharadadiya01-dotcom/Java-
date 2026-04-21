class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Method to open account
    void openAccount(String accNo, String name, double initialBalance) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBalance;
        System.out.println("Account Opened Successfully!");
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// SavingAccount subclass
class SavingAccount extends BankAccount {
    double interestRate = 5; // 5%

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Saving Account Interest: " + interest);
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    double rate = 7; // 7%
    int years = 2;

    void maturityAmount() {
        double maturity = balance + (balance * rate * years) / 100;
        System.out.println("Fixed Deposit Maturity Amount: " + maturity);
    }
}

// Main class
public class pr14 {
    public static void main(String[] args) {

        // Saving Account
        SavingAccount sa = new SavingAccount();
        sa.openAccount("SA101", "Krisha", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("------------------------");

        // Fixed Deposit Account
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("FD201", "Krisha", 20000);
        fd.deposit(5000);
        fd.checkBalance();
        fd.maturityAmount();
    }
}
//output 
//Account Opened Successfully!
//Deposited: 2000.0
//Withdrawn: 1500.0
//Current Balance: 10500.0
//Saving Account Interest: 525.0
//------------------------//Account Opened Successfully!
//Deposited: 5000.0
//Current Balance: 25000.0
//Fixed Deposit Maturity Amount: 28500.0
