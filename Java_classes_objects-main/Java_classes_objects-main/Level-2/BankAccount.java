public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void displayBalance() {
        System.out.println("Account Holder:"+accountHolder+"\nAccount Number: "+accountNumber+"\nBalance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ajay", "1234567890", 1000.0);
        acc.deposit(500.0);
        acc.withdraw(300.0);
        acc.displayBalance();
    }
}
