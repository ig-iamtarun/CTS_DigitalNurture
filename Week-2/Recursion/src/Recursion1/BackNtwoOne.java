package Recursion1;

public class BackNtwoOne {
    static void ntwoOne(int n ){
        if(n<1){
            return;
        }
        System.out.println(n);
        ntwoOne(n-1);

    }
   public static void main(String[] args) {
        int n = 5;
        ntwoOne(n);
    }
}
