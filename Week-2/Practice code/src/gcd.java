import java.util.Scanner;
public class gcd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a = sc.nextInt();

        System.out.print("enter the second number : ");
        int b = sc.nextInt();


        int ans = gcdd(a ,b);
        System.out.println("gcd = " + ans);
    }
    static int gcdd( int a, int b){
        while (b!=0){
            int temp =b;
            b = a%b;
            a = temp;
        }
        return a ;
    }
}