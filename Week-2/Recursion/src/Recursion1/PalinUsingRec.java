package Recursion1;

public class PalinUsingRec {

    static boolean palin(String str ,int left,int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left)!= str.charAt(right)){
            return false;
        }
        return palin(str,left+1,right-1);
    }

   public static void main(String[] args) {
        String str = "tarunvijaayw";
       System.out.println(palin(str,0, str.length()-1));

    }
}
