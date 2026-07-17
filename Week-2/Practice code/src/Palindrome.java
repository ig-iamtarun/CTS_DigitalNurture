public class Palindrome {
   public static void main(String[] args) {
    int n = 555;
       System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n ){
       int original = Math.abs(n);
       int temp = original;
       int rev =0;

       while (temp>0){
           int digit = temp % 10;
           rev = (rev*10 )+ digit;
           temp = temp /10;

       }
       if(original == rev){
           return true;
       }else {
           return false;
       }
    }
}