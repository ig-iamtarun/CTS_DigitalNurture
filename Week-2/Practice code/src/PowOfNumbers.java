public class PowOfNumbers {
    static void main(String[] args) {
    int n =2;
    int rev =reverseDigit(n);
    int ans =pow(n,rev);
        System.out.println(ans);
    }
    static int reverseDigit(int n){
        int rev=0;
        while (n>0){
            int digit =n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }
        return rev;
    }

    static int pow(int n,int r){
        int result=1;
        for(int i=0;i<r;i++){
            result = result * n;
        }
        return result;
    }

}
