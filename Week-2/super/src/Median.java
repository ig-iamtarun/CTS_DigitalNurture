import java.util.Arrays;

public class Median {
   public static void main(String[] args) {
       int[]arr = {4,23,4,2,24,5,2};
       median(arr);
       System.out.println(Arrays.toString(arr));

    }
    static void median(int[] arr){
        Arrays.sort(arr);

        int n =arr.length;

        if(n%2==1){
            System.out.println(arr[n/2]);
        }else {
            double median =(arr[n / 2] + arr[n / 2 ]- 1) / 2.0;
            System.out.println(median);
        }


    }
}
