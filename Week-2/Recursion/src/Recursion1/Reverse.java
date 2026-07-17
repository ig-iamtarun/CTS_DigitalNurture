package Recursion1;

import java.util.Arrays;

public class Reverse {

    static void reverse(int[] arr, int left,int right){
        if(left>=right){
            return;
        }
        int temp =arr[left];
        arr[left]= arr[right];
        arr[right]= temp;

        reverse(arr, left+1,right-1);
    }
    public static void main(String[] args) {
        int []arr ={43,23,5,6,4,1};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
