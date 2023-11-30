public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount with default values
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.withdraw(500);
        account1.displayAccountInfo();

        // Creating a BankAccount with specified values
        BankAccount account2 = new BankAccount("1234-5678", "Alice");
        account2.deposit(2000);
        account2.withdraw(1000);
        account2.displayAccountInfo();

        // Creating a BankAccount with initial balance
        BankAccount account3 = new BankAccount("9876-5432", "Bob", 500);
        account3.deposit(100);
        account3.displayAccountInfo();
    }
}


