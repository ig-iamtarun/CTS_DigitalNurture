import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int bits = 0;

        while (temp > 0) {
            bits++;
            temp /= 2;
        }

        int mask = (1 << bits) - 1;

        int result = n ^ mask;

        System.out.println(result);
    }
}