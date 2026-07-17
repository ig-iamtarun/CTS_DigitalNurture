package Abstract;

public class Main {
   public static void main(String[] args) {
      SavingAccount s =new SavingAccount("Tarun",25000);

      s.deposit(5000);
      s.withdraw(2000);
      s.withdraw(600000);


    }
}
