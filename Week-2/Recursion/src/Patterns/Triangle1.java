package Patterns;

public class Triangle1 {
    public static void main(String[] args) {
        triangle(4, 0);
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            triangle(r, c + 1);   // go deep first
            System.out.print("*");
        } else {
            triangle(r - 1, 0);   // move to next row
            System.out.println();
        }
    }
}