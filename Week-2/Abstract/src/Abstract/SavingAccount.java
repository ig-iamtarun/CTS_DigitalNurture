package Abstract;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accoutHolder, double balance) {
        super(accoutHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance =balance+amount;
        System.out.println(amount + "deposited");
        System.out.println("current balance :"+balance);
    }
    @Override
    void withdraw(double amount) {
        if(amount<=balance){
            balance =balance -amount;

            System.out.println(amount + "withdrawn");
            System.out.println("current balance : " + balance);
        }else {
            System.out.println("insufficient balance");
        }

    }
}
