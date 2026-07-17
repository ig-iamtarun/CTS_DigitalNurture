public class Average {
   public static void main(String[] args) {
        int []arr ={3,2,4,3,2,1};
        average(arr);
       System.out.println(arr);
    }
    static void average(int [] n){
       int sum =0;

       for(int i=0;i<n.length;i++){
           sum =sum+n[i];
       }
       int average =sum/n.length;
        System.out.println("the average is  : "+ average);
    }

}
