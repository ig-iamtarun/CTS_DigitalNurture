import java.util.ArrayList;
import java.util.List;

public class FindAllMissingDuplicate {

    public List<Integer> findMissingNumbers(int[] arr) {
        int i = 0;

        // Step 1: Cyclic Sort
        while (i < arr.length) {
            int index = arr[i] - 1;

            if (arr[i] != arr[index]) {
                swap(arr, i, index);
            } else {
                i++;
            }
        }

        // Step 2: Find missing numbers
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}