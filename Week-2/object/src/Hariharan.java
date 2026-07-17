class BankAccount1{
    String accountHolder;
    int balance;

    public BankAccount1(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    void deposit(int amount){
        balance =balance+amount;

    }
    void display(){
        System.out.println("account holder : "+ accountHolder);
        System.out.println("Balance :" + balance);
        System.out.println();
    }
}

public class Hariharan {
   public static void main(String[] args) {
    BankAccount1 n =new BankAccount1("tarun",54000);
    n.display();
    n.deposit(65543);
    n.display();
    }
}
