package Recursion1;
import java.util.Scanner;
public class Names {
   public static void main(String[] args) {
        int n =5;
        printName(1,n);
    }
    static void printName(int i, int n){
       if(i>n){
           return;
       }else {
           System.out.println("tarun");
            printName(i+1,n);
       }

    }

}
