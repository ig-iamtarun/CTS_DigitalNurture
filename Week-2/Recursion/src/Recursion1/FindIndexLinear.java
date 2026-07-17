package Recursion1;

public class FindIndexLinear {
    public static void main(String[] args) {
        int []arr ={2,3,4,5,6,7,8};
        System.out.println(findIndex(arr,8,0));
    }
    static int findIndex(int []arr,int target,int index){
        if (index == arr.length) {
            return -1;
        }
        if(arr[index ]== target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
}
