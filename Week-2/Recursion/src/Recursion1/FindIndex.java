package Recursion1;

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 4, 5};

//        ArrayList<Integer> result = findIndex(arr, 4, 0, new ArrayList<>());
//        System.out.println(result);
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Integer>ans = findIndex(arr,4,0, list);
        System.out.println(list );

    }
    static ArrayList <Integer>  findIndex(int []arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findIndex(arr, target, index + 1, list);
    }
}
