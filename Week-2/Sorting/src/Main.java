import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Main{
   public static void main(String[] args) {
        int []arr = {5,6,8,1,2,3};
        sort(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr));

    }
    static void sort(int []nums,int low ,int hi){
        if(low>=hi){
            return;
        }
        int s =low;
        int e =hi;
        int mid = s+(e-s)/2;
        int pivot = nums[mid];

        while (s<=e){
            while (nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
           if(s<=e){
               int temp = nums[s];
               nums[s]=nums[e];
               nums[e]=temp;
               s++;
               e--;
           }
        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}