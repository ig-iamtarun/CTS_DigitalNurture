import java.util.Scanner;
public class FindGratest {
   public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
       System.out.println("enter the number");
        String str  = sc.nextLine();

        String  []arr = str.split("-");

        int max = Integer.parseInt(arr[0]);

        for(int i =1 ;i<arr.length;i++){
           int num = Integer.parseInt(arr[i]);
           if(num>max){
               max = num;
           }
        }
       System.out.print(max);
    }
}

