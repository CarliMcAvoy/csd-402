package csd402;


public class Module5 {
    public static void main(String[] args) {

        double[][] maxFirst = {{2, 5, 9}, {4, 9, 11}};
        displayResultsMax(maxFirst, locateLargest(maxFirst));


        int[][] maxSecond = {{4, 13, 22}, {23, 2, 8}};
        displayResultsMax(maxSecond, locateLargest(maxSecond));


        double[][] minFirst = {{45, 82, 33}, {34, 22, 40}};
        displayResultsMin(minFirst, locateSmallest(minFirst));


        int[][] minSecond = {{8, 50, 14}, {43, 19, 27}};
        displayResultsMin(minSecond, locateSmallest(minSecond));
    }


    public static int[] locateLargest(double[][] arrayParam) {

        double maxIndex = arrayParam[0][0];
        int[] maxLocation = null;
        int r;
        int c;

        for (r = 0; r < arrayParam.length; r++) {
            for (c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > maxIndex) {
                    maxIndex = arrayParam[r][c];
                    maxLocation = new int[]{r, c};
                }
                else if (arrayParam[r][c] == maxIndex) {
                    maxLocation = new int[]{r, c};
                }
            }
        }

        return maxLocation;
    }


    public static int [] locateLargest(int [][] arrayParam){

        int maxIndex = arrayParam[0][0];
        int [] maxLocation = null;
        int r;
        int c;

        for (r = 0; r < arrayParam.length; r++) {
            for (c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] > maxIndex) {
                        maxIndex = arrayParam[r][c];
                        maxLocation = new int[]{r, c};
                }
                else if (arrayParam[r][c] == maxIndex) {
                    maxLocation = new int[]{r, c};
                }
            }
        }

        return maxLocation;
    }


    public static int [] locateSmallest(double [][] arrayParam){
        double minIndex = arrayParam[0][0];
        int [] minLocation = null;
        int r;
        int c;

        for (r = 0; r < arrayParam.length; r++) {
            for (c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < minIndex) {
                    minIndex = arrayParam[r][c];
                    minLocation = new int[]{r, c};
                }
                else if (arrayParam[r][c] == minIndex) {
                    minLocation = new int[]{r, c};
                }
            }
        }

        return minLocation;
    }


    public static int [] locateSmallest(int [][] arrayParam){
        int minIndex = arrayParam[0][0];
        int [] minLocation = null;
        int r;
        int c;

        for (r = 0; r < arrayParam.length; r++) {
            for (c = 0; c < arrayParam[r].length; c++) {
                if (arrayParam[r][c] < minIndex) {
                    minIndex = arrayParam[r][c];
                    minLocation = new int[]{r, c};
                }
                else if (arrayParam[r][c] == minIndex) {
                    minLocation = new int[]{r, c};
                }
            }
        }

        return minLocation;
    }


    public static void displayResultsMax(double[][] array, int[] getLocation) {
        System.out.println("2D Array: ");
        for (double number : array[0]) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (double number : array[1]) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Location of Max Number: ");
        for (int i = 0; i < getLocation.length; i++) {
            System.out.print("[" + getLocation[i] + "]");
        }
        System.out.println();
    }


    public static void displayResultsMax(int[][] array, int[] getLocation) {
        System.out.println("2D Array: ");
        for (int number : array[0]) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int number : array[1]) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Location of Max Number: ");
        for (int i = 0; i < getLocation.length; i++) {
            System.out.print("[" + getLocation[i] + "]");
        }
        System.out.println();
    }


    public static void displayResultsMin(double[][] array, int[] getLocation) {
        System.out.println("2D Array: ");
        for (double number : array[0]) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (double number : array[1]) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Location of Min Number: ");
        for (int i = 0; i < getLocation.length; i++) {
            System.out.print("[" + getLocation[i] + "]");
        }
        System.out.println();
    }


    public static void displayResultsMin(int[][] array, int[] getLocation) {
        System.out.println("2D Array: ");
        for (int number : array[0]) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int number : array[1]) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Location of Min Number: ");
        for (int i = 0; i < getLocation.length; i++) {
            System.out.print("[" + getLocation[i] + "]");
        }
    }
}







