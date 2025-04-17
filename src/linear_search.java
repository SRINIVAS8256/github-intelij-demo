public class linear_search {
    public static void main(String[] args) {
        int[] arr={1,23,32,4,3,56,768};
        System.out.println("at index "+(search(arr,768)));
    }
    static int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return 1;
            }
        }
        return -1;
    }
}
