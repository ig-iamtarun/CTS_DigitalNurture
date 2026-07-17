package Recursion1;

public class One2N {

    static void oneTwoN(int i ,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        oneTwoN(i+1,n );
    }
    static void main(String[] args) {
        int n=5;
        oneTwoN(1,n);
    }
}
