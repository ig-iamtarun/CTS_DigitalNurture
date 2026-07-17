public class pattern30 {
   public static void main(String[] args) {
    pattern(4);
    }
    static void pattern(int n){
       for (int row =1;row<=n;row++){


           for(int col =row;col>=1;col--){
               System.out.print(col);
           }
           for(int col =2 ;col<=row;col++){
               System.out.print(col);
           }
           System.out.println();
       }
    }
}
