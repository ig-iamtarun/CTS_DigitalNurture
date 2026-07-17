package Recursion1;

import java.util.Arrays;

public class RotateByk {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7,8,9};
        rotate(arr,arr.length,3);
        System.out.println(Arrays.toString(arr));

    }
    static void rotate (int[] arr, int nums ,int k){
        k=k%nums;
        reverse(arr,0,k-1);
        reverse(arr,k,nums-1);
        reverse(arr,0,nums-1);

    }
    static void reverse(int [] nums,int start ,int end){
       while (start<end){
           int temp = nums[start];
           nums[start]= nums[end];
           nums[end]= temp;
           start++;
           end--;
       }

    }
}
