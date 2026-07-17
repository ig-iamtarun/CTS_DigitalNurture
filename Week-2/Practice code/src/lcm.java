
import java.util.Scanner;
public class lcm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a = sc.nextInt();

        System.out.print("enter the second number : ");
        int b = sc.nextInt();

        int ans = lcmm(a ,b);
        System.out.print(ans);
    }
    static  int gcd (int a ,int b){
        while (b!=0 ){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    static int lcmm(int a ,int b){
        return  (a*b)/gcd(a,b);
    }
}
