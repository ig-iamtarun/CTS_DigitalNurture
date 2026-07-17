package Recursion1;
import java.util.ArrayList;

public class PrintSubsequence {

    static void printSubsequence(int index, ArrayList<Integer> ds, int[] arr, int n) {

        // Base case
        if (index == n) {

            if (ds.size() == 0) {
                System.out.println("{}");
            } else {
                for (int num : ds) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            return;
        }

        // Pick the current element
        ds.add(arr[index]);
        printSubsequence(index + 1, ds, arr, n);

        // Backtrack
        ds.remove(ds.size() - 1);

        // Don't pick the current element
        printSubsequence(index + 1, ds, arr, n);
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2};
        int n = arr.length;

        ArrayList<Integer> ds = new ArrayList<>();

        printSubsequence(0, ds, arr, n);
    }
}
