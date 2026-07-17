package Recursion1;

public class Main {
    static int rec(int n){
        if(n==1){
            return 1;
        }

        return n * rec(n-1);

    }
   public static void main(String[] args) {
        int n =5;
       System.out.println(rec(n));
    }
}

