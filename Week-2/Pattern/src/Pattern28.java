public class Pattern28 {
   public static void main(String[] args) {
        pattern(3);

    }
    static void pattern(int n ){
        for(int row = 0;row< 2*n;row ++){
            int totalColInRow = row >n ? 2*n-row:row;
            int noOfSpace = n-totalColInRow;
            for (int s= 0;s<noOfSpace;s++){
                System.out.print(" ");
            }
            for(int col =0;col<totalColInRow;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
