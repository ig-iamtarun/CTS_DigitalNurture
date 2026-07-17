package Recursion1;

import java.util.Scanner;

public class OneTwoN {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i  =sc.nextInt();
       int n =sc.nextInt();
       alpha(i,n);
    }
    static void alpha(int i ,int n){
       if(i>n){
           return;
       }
        System.out.println(i + " ");
       alpha(i+1,n);

    }
}
