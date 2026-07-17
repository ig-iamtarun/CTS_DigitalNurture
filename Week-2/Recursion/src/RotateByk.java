import java.util.Arrays;

public class RotateByk {
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        leftRotate(arr,arr.length,2);
        System.out.println(Arrays.toString(arr));

    }
    static void leftRotate(int []arr , int n, int d){
        d = d%n;
        int[] temp =new int [d];
        for(int i=0 ;i< d;i++){
            temp[i] = arr[i];
        }
        for (int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
    }
}
