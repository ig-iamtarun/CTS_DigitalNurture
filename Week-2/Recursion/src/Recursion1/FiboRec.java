package Recursion1;

public class FiboRec {

    static int fibo(int n ){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(fibo(n));
    }
}


