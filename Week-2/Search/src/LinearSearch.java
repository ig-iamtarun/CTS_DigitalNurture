import java.util.Scanner;
public class LinearSearch {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the number of element : ");
       int n = sc.nextInt();

       int []nums =new int[n];
       System.out.print("Enter how many elements in the array : ");

       for(int i =0;i<n;i++){
           nums[i]= sc.nextInt();

       }
       System.out.print("enter the target element");
       int target = sc.nextInt();


       int ans =linear(nums,target);
       System.out.println(ans);
    }
    static int linear(int[] arr, int target){
       if(arr.length == 0){
           return -1;
       }
       for(int i =0;i<arr.length;i++){
           if(arr[i]==target){
               return i;
           }
       }
       return -1;
    }

}
