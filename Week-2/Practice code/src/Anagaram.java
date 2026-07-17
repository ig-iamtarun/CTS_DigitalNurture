import java.util.Arrays;
import java.util.Scanner;

public class Anagaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first element");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter the second element");
        String str2 = sc.nextLine().toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("it is anagaram");
        }else {
            System.out.println("it is not an anagaram");
        }
    }
}
