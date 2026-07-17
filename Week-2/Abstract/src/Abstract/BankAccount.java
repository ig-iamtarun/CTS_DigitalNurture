package Abstract;

abstract public class BankAccount {
    String accoutHolder;
    double balance;

    public BankAccount(String accoutHolder, double balance) {
        this.accoutHolder = accoutHolder;
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
