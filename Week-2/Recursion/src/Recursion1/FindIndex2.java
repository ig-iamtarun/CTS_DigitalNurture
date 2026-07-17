package Recursion1;

import java.util.ArrayList;

public class FindIndex2 {
   public static void main(String[] args) {
    int []arr = {1,2,3,4,4,8};
//       ArrayList<Integer> list =new ArrayList<>();
//       ArrayList<Integer>ans = findIndex(arr,4,0);
//       System.out.println(ans);
       System.out.println(findIndex(arr,4,0));
    }
    static ArrayList<Integer> findIndex(int []arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
           list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndex(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
