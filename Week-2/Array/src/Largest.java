import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr = {32,43,54,65,4,7,8};
        System.out.println(largest(arr));

    }
    static int largest(int []arr ){
        int max= arr[0];
        for(int i =0 ;i < arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}
