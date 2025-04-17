import java.util.Arrays;

public class d2_max_min {
        public static void main(String[] args) {
            int[][] arr={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };

            System.out.println(search_max(arr));
            System.out.println(search_min(arr));

        }
        static int search_max(int[][] arr) {

            int max = arr[0][0];
            for (int row = 0; row < arr.length; row++) {
                for (int col = 1; col < arr[row].length; col++) {
                    if (arr[row][col] > max) {
                        max = arr[row][col];
                    }
                }
            }
            return max;
        }
    static int search_min(int[][] arr) {

        int min = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}