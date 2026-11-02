
class BankAccount {
    private String account_Number;
    private double account_balance;
    static int account_Count = 0;
    final int accountId;
    BankAccount(String accountNumber, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.account_Number = accountNumber;
        this.account_balance = balance;
        account_Count++;
        accountId = account_Count;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            account_balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        }
        else if (amount > account_balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            account_balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    public double getBalance() {
        return account_balance;
    }
    public void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Number: " + account_Number);
        System.out.println("Balance: " + account_balance);
    }
}
class BankTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("ACC101", 5000);
        BankAccount b2 = new BankAccount("ACC102", 3000);
        System.out.println("--- Account 1 ---");
        b1.display();
        b1.deposit(2000);
        b1.withdraw(1000);
        System.out.println("Current Balance: " + b1.getBalance());
        System.out.println("\n--- Account 2 ---");
        b2.display();
        b2.deposit(-500);
        b2.withdraw(5000);
        System.out.println("\nTotal Accounts: " +
                BankAccount.account_Count);
    }
}
