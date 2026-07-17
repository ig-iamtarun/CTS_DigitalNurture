import java.util.HashMap;
import java.util.Scanner;
public class CountFrequency {
   public static void main(String[] args) {
       int []arr ={10,5,10,15,10,5};
       countFrequency(arr);
       System.out.println(arr);

    }
    static void countFrequency(int[]arr){
       HashMap<Integer,Integer> map =new HashMap<>();

       for(int i =0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i],map.get(arr[i])+1);
           }else {
               map.put(arr[i],1);
           }
       }
       for(Integer Key : map.keySet()){
           System.out.println(Key +" "+ map.get(Key));
       }
    }
}

