public class Reverse1 {
    public static void main(String[] args) {
        int n = 12345;

        int reversed = reverse(n);
        System.out.println("Reversed number: " + reversed);
    }

    static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int digit = n % 10;     // get last digit
            rev = rev * 10 + digit; // build reversed number
            n = n / 10;             // remove last digit
        }

        return rev;
    }
}