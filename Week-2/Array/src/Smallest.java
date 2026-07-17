import java.util.Scanner;

public class Smallest {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int []arr= {32,43,6,67,43,3,1};
       System.out.println(smallest(arr));

    }
    static int  smallest(int[]arr){
       int min =arr[0];
       for(int i= 0;i< arr.length;i++){
           if(arr[i]<min){
               min =arr[i];
           }

       }
        return min;
    }

}
