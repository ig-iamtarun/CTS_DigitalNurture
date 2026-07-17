public class SquareRoot {
   public static void main(String[] args) {
        int n =4;
       System.out.println(squareRoot(n));
    }
    static int squareRoot(int n){
       int i =1;
       while (i*i<=n){
           i++;
       }
       return i-1;
    }
}
