class BankAccount{
    String accountHolder;
    int balance;

    public BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(int amount){
        balance =balance+amount;
        System.out.println(amount + "depsited sucessfully");
    }
    void withdraw(int amout){
        if(amout<=balance){
            balance=balance-amout;
            System.out.println(amout+ "withdrawn sucessfully");
        }else{
            System.out.println("insufficient balance");
        }
    }
    void display(){
        System.out.println("account holder : "+ accountHolder);
        System.out.println("balance : "+ balance);
    }

}
public class Lal {
    static void main(String[] args) {
        BankAccount B = new BankAccount("tarun", 1000);
        B.display();
        B.deposit(500);
        B.withdraw(100);
        B.display();
    }
}
