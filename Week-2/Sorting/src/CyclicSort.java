import java.util.Arrays;

public class CyclicSort {
   public static void main(String[] args) {
       int []arr ={5,4,1,2,3};
       cyclic(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int []arr){
       int i =0;
       while (i < arr.length){
           int index  = arr[i]-1;
           if (arr[i]!=arr[index]){
               swap(arr,i,index);
           }else {
               i++;
           }

       }
    }
    static void swap(int []arr,int first ,int second){
       int temp= arr[first];
       arr[first]= arr[second];
       arr[second]= temp;
    }
}




//static int[] mergeSort(int[] arr) {
//    if (arr.length == 1) {
//        return arr;
//    }
//
//    int mid = arr.length / 2;
//
//    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
//    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
//
//    return merge(left, right);
//}
//
//private static int[] merge(int[] first, int[] second) {
//    int[] mix = new int[first.length + second.length];
//
//    int i = 0;
//    int j = 0;
//    int k = 0;
//
//    while (i < first.length && j < second.length) {
//        if (first[i] < second[j]) {
//            mix[k] = first[i];
//            i++;
//        } else {
//            mix[k] = second[j];
//            j++;
//        }
//        k++;
//    }
//
//    // it may be possible that one of the arrays is not complete
//    // copy the remaining elements
//    while (i < first.length) {
//        mix[k] = first[i];
//        i++;
//        k++;
//    }
//
//    while (j < second.length) {
//        mix[k] = second[j];
//        j++;
//        k++;
//    }
//
//    return mix;
