public class Main {

    static int countWays(int current, int n, int x) {

        // Reached the peak
        if (current == n)
            return 1;

        // Crossed the peak
        if (current > n)
            return 0;

        int ways = 0;

        // Try every possible jump
        for (int jump = 1; jump <= x; jump++) {
            ways += countWays(current + jump, n, x);
        }

        return ways;
    }

    public static void main(String[] args) {

        int n = 6;
        int start = 3;
        int x = 2;

        System.out.println(countWays(start, n, x));
    }
}