package Recursion1;


public class Backtracking {

    static void oneToN(int i,int n){
        if(i<1){
            return;
        }
        oneToN(i-1,n);
        System.out.println(i);
    }

   public static void main(String[] args) {
        int n=5;
        oneToN(n,n);
    }

}
