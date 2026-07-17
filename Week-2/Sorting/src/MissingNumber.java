public class MissingNumber {
   public static void main(String[] args) {
        int []arr ={3,0,1};
       System.out.println(cyclic(arr));
    }
    static int cyclic(int[]arr){
       int i=0;
       while (i<arr.length){
           if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
               swap(arr,i,arr[i]);
           }else {
               i++;
           }
       }
        for (int index =0 ;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[]arr, int first ,int second){
       int temp =arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
    }
}
