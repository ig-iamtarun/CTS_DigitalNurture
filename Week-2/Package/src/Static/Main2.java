package Static;
class BankAccount{
    String accountHolder;
    static float interest = 7.15f;
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    void display(){
        System.out.println("the name of the account holder : "+ accountHolder);
        System.out.println("the rate of the interst is : "+ interest);
    }
}
public class Main2 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("tarunvijaay");
        BankAccount b2 = new BankAccount("roopanvishnu");

        b1.display();
        b2.display();

        BankAccount.interest =8.0f;
        System.out.println("after the change of the bank account ");
        b1.display();
        b2.display();
    }
}
