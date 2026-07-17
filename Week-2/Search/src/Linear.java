public class Linear {
  public   static void main(String[] args) {
        int[] nums ={32,4,32,21,54,76,3};
        int target= 32;
        int ans = linearSerch(nums,target);
      System.out.println(ans);

    }
    static  int linearSerch(int []arr , int target){
        if(arr.length==0){
            return  -1;
        }
        for (int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
