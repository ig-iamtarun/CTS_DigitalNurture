public class Maximum {
   public static void main(String[] args) {
        int [] arr ={ 1,2,3,4,5,5,6};
        int k=3;
       System.out.println(maxSum(arr,k));
    }
    static int maxSum(int []arr ,int k){
       int n = arr.length;
       int maxSum = Integer.MIN_VALUE;

       for (int i =0 ; i<= n-k;i++){
           int currentSum= 0;

           for(int j=i;j<i+k;j++){
               currentSum= currentSum+arr[j];

           }
           maxSum = Math.max(maxSum,currentSum);
       }
       return maxSum;
    }
}
