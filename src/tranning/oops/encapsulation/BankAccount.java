package tranning.oops.encapsulation;

/**
 * @author bikalpa.chaudharii
 * @project java-practice
 * @created 26/7/28
 */
public class BankAccount {
    private double balance;   // hidden — can't be accessed directly from outside

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {          // controlled read access
        return balance;
    }

    public void deposit(double amount) {  // controlled write access
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Final balance: " + account.getBalance()); // 1300
        account.balance = -9999;  // NOT allowed — compile error, balance is private
        System.out.println(account.getBalance());
    }
}
