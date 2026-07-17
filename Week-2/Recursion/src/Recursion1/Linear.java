package Recursion1;

public class Linear {
    public static void main(String[] args) {
    int []arr = {2,3,4,5,6,7,8,9};

        System.out.println(find(arr,4,0));

    }
    static boolean find(int []arr ,int target,int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index]== target)|| find(arr,target,index+1);
    }


}
