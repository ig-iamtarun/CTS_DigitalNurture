import java.util.Arrays;
import java.util.Scanner;
public class Rearrange {
    static void main(String[] args) {
        int []arr = {8,7,1,6,5,9};
        rearrange(arr);

        System.out.println("the rearrange array is :");

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }


    }
    static void rearrange(int [] arr){
        Arrays.sort(arr);
        int n =arr.length;
        int i =n/2;
        int j= n-1;

        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }

}
