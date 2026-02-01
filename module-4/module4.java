package csd402;

public class module4 {

    public static void main(String[] args) {

        short[] short_array = {4, 8, 13, 15, 15, 43, 55, 89};
        short short_list = average(short_array);
        System.out.println(short_list);

        int[] int_array = {-20, 1, 13, 34, 56, 78, 90, 134, 255, 390, 400};
        int int_list = average(int_array);
        System.out.println(int_list);

        long[] long_array = {-39, -14, 2, 44, 69, 150, 168, 380, 567, 890};
        long long_list = average(long_array);
        System.out.println(long_list);

        double[] double_aray = {0.34, 3.67, 16.79, 27, 56.89};
        double double_list = average(double_aray);
        System.out.println(double_list);
    }

        public static short average ( short[] array){
            System.out.println("This is the short array: ");

            for (short number : array) {
                System.out.print(number + " ");
            }

            int array_length = array.length;
            double list_sum = 0;
            for (int i = 0; i < array_length; ++i) {
                list_sum += array[i];
            }
            short avg = (short) (list_sum / array_length);

            System.out.println();

            System.out.println("This is the average of the short array: ");
            return avg;
        }

        public static int average ( int[] array){
            System.out.println();
            System.out.println("This is the integer array: ");

            for (int number : array) {
                System.out.print(number + " ");
            }

            int array_length = array.length;
            double list_sum = 0;
            for (int i = 0; i < array_length; ++i) {
                list_sum += array[i];
            }
            int avg = (int) (list_sum / array_length);

            System.out.println();

            System.out.println("This is the average of the integer array: ");
            return avg;
        }

        public static long average ( long[] array){
            System.out.println();
            System.out.println("This is the long array: ");

            for (long number : array) {
                System.out.print(number + " ");
            }

            int array_length = array.length;
            double list_sum = 0;
            for (int i = 0; i < array_length; ++i) {
                list_sum += array[i];
            }
            long avg = (long) (list_sum / array_length);

            System.out.println();

            System.out.println("This is the average of the long array: ");
            return avg;
        }

        public static double average ( double[] array){
            System.out.println();
            System.out.println("This is the double array: ");

            for (double number : array) {
                System.out.print(number + " ");
            }

            int array_length = array.length;
            double list_sum = 0;
            for (int i = 0; i < array_length; ++i) {
                list_sum += array[i];
            }
            double avg = (double) (list_sum / array_length);

            System.out.println();

            System.out.println("This is the average of the double array: ");
            return avg;
        }
}
