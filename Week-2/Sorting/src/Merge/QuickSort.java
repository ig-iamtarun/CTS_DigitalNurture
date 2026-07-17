package Merge;

import java.util.Arrays;

public class QuickSort {
   public static void main(String[] args) {
    int []arr ={5,6,4,3,2,1,7,8};
    sort(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]nums, int low,int hi){
       if(low >= hi){
           return;
       }
       int s = low;
       int end = hi;
       int m = s+(end-s)/2;

       int pivot = nums[m];

       while (s<=end){
           while (nums[s]<pivot){
               s++;
           }

           while (nums[end]>pivot){
               end--;
           }

           if(s<=end){
               int temp = nums[s];
               nums[s] = nums[end];
               nums[end]= temp;
               s++;
               end--;

           }
       }
       sort(nums,low,end);
       sort(nums,s,hi);
    }
}

