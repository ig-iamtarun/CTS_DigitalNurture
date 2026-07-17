//public class FirstAndLast {
//    public static void main(String[] args) {
//
//    }
//    public int[] searchRange(int[] nums, int target) {
//        int ans=[-1,-1];
//        int start =search(nums,target,firstStartIndex:true);
//
//        int start =0;
//        int end=nums.length-1;
//
//        while (start<=end){
//            int mid = start+(end-start)/2;
//
//            if(target<nums[mid]){
//                end=mid-1;
//            } else if (target>nums[mid]) {
//                start=mid+1;
//
//            }else {
//                return mid;
//            }
//        }
//        int search (int[]nums,int target,boolean firstStartIndex){
//            int start =0;
//            int end=nums.length-1;
//
//            while (start<=end){
//                int mid = start+(end-start)/2;
//
//                if(target<nums[mid]){
//                    end=mid-1;
//                } else if (target>nums[mid]) {
//                    start=mid+1;
//
//                }else {
//                  ans=mid;
//                  if(firstStartIndex==true){
//                      end=mid-1;
//                  }else {
//                      start=mid+1;
//                  }
//                }
//        }
//            return ans;
//    }
//}
