public class Reverse {
    static void main(String[] args) {
    int n = 4321;
        System.out.println(reverseDigit(n));
    }
    static int reverseDigit(int n){
        int rev =0;
        while(n>0){
            int digit =n%10;
            rev =(rev*10)+digit;
            n=n/10;
        }
        return rev;
    }
}
