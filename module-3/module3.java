package csd402;

public class module3 {
    public static void main(String args[]) {

        int rows = 7;

        for (int r = 0; r < rows; r++) {
            for (int s = 0; s < (rows - r)*2; s++){
            System.out.print(" ");
        }

        int num = 1;
        for (int p = 0; p <= r; p++){
            System.out.print(num + " ");
            num *= 2;
        }
        num /= 4;
        for (int d = 0; d < r; d++){
            System.out.print(num + " ");
            num /= 2;
        }

        int total_width = rows * 4;
        int current_width = (rows - r) * 2 + (2 * r) * 2;
        for (int k = 0; k < total_width - current_width; k++) {
            System.out.print(" ");
            }

        System.out.println("@");
        System.out.println();
        }
    }
}
