public class TwoPointers {
   public static void main(String[] args) {
    int []arr = {1,2,4,4,7,8,11,12};
    int target = 2 ;
       System.out.println(twoSum(arr,target));
    }
    static boolean twoSum(int[]arr , int target){
       int left =0 ;
       int right =arr.length-1;

       while (left < right) {
           int sum = arr[left] + arr[right];
        if(sum == target){
            System.out.println("found pair" + arr[left] +  "  , " +arr[right]);
            return true;
        }
        else if(sum < target){
            left++;
        }
        else {
            right--;
        }
       }
       return false;
   }

}
