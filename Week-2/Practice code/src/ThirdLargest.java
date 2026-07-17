public class ThirdLargest {
    static void main(String[] args) {
        int []arr = {3,4,5,6,7,54,2};
        System.out.println(thirdLargest(arr));
    }
    static int thirdLargest(int []arr){
        int n = arr.length;

        if(n<3) return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i =0 ; i<n ;i++){
            int nums =arr[i];

            if(nums>=first){
                third= second;
                second=first;
                first= nums;
            }else if(nums>=second){
                third =second;
                second= nums;
            }else if(nums>=first){
                third = nums;
            }
        }
        return third;
    }
}
