import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//public class Main{
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("enter the first string :");
//        String s1 = sc.nextLine().toLowerCase();
//
//        System.out.print("enter the second String : ");
//        String s2  = sc.nextLine().toLowerCase();
//
//        char[]arr1 = s1.toCharArray();
//        char[]arr2 = s2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        if(Arrays.equals(arr1,arr2)){
//            System.out.print("its anageram ");
//        }
//        else {
//            System.out.println("not a anagaram");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int mask = (1 << Integer.toBinaryString(n).length()) - 1;
//
//        int result = n ^ mask;
//
//        System.out.println(result);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next().toLowerCase();
        int n = sc.nextInt();

        int firstSunday = 0;

        switch (day) {
            case "sun":
                firstSunday = 1;
                break;
            case "mon":
                firstSunday = 7;
                break;
            case "tue":
                firstSunday = 6;
                break;
            case "wed":
                firstSunday = 5;
                break;
            case "thu":
                firstSunday = 4;
                break;
            case "fri":
                firstSunday = 3;
                break;
            case "sat":
                firstSunday = 2;
                break;
        }

        int count = 0;

        if (n >= firstSunday) {
            count = 1 + (n - firstSunday) / 7;
        }

        System.out.println(count);
    }
}