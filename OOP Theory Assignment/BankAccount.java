public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount() {
        this.accountNumber = "0000-0000"; 
        this.accountHolder = "Md Rasel"; 
        this.balance = 0.0; 
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; 
    }

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    private void internalMethod() {

    }

    protected void protectedMethod() {
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
    
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayAccountInfo();

        BankAccount account2 = new BankAccount("1234-5678", "Asif");
        account2.deposit(2000);
        account2.withdraw(1000);
        account2.displayAccountInfo();

        BankAccount account3 = new BankAccount("9876-5432", "Sifat", 500);
        account3.deposit(100);
        account3.displayAccountInfo();
    }
}
