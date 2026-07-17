public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 0; row < n; row++){

            // spaces (decreasing)
            for(int s = 0; s < n - row; s++){
                System.out.print(" ");
            }

            for(int col = 0; col < n; col++){
                if(row == 0 || row == n-1 || col == 0 || col == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
