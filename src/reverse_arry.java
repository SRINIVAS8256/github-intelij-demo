import java.util.Arrays;

public class reverse_arry {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 4, 556, 7};
        int[] reversedArr = new int[arr.length];  // Create a new array for the reversed version

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];  // Copy elements in reverse order
        }

        System.out.println(Arrays.toString(reversedArr));  // Print the reversed array
    }
}