import java.util.Scanner;
public class Lar{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();


        int[]arr = new int[n];

        System.out.print("Enter the array element : ");

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<n;i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest= arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        System.out.print("second Largest is : " + secondLargest);

    }
}