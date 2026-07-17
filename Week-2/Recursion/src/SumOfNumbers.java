import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Step 2: Take input
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 3: Calculate sum
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        // Step 4: Print result
        System.out.println("Total Sum = " + total);
    }
}