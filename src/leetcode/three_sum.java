package leetcode;

public class three_sum {
    public static void main(String[] args) {
        int count = 0;
        char arr[] = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    System.out.println(arr[i] + "  " + arr[j] + " " + arr[k] + "\n");
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
