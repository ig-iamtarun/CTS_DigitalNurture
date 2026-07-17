import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicate {
   public static void main(String[] args) {
       int[]arr ={43,2,2,4,5,2,4};
       removeDuplicate(arr);
       System.out.println(arr);


    }
    static void removeDuplicate(int[]arr){

        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
