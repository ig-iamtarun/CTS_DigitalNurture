import javax.sound.sampled.Line;
import java.util.Scanner;

public class Paalin {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the String  : ");
       String str =  sc.nextLine();
       System.out.println(palin(str));

    }
    static boolean palin(String str){
       int left =0;
       int right =str.length()-1;

       while (left<right){
           if(str.charAt(left)!=str.charAt(right)){
               return false;

           }
           left++;
           right--;
       }
       return true;
    }

}
