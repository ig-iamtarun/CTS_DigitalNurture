public class SearchInRange {
    public static void main(String[] args) {
    int [] nums = {32,43,65,23,12,32,65,4,3,2};
    int target =4;
        System.out.println(linearSearch(nums,target,1,4));
    }
    static int linearSearch(int[]arr , int target ,int start ,int end){
        if (arr.length==0){
            return -1;
        }
        for(int i=start;i<end;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
