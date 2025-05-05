public class linear_search {
    public static void main(String[] args) {

        int[] arr={1,23,32,4,3,56,768,34985,34534,5,35,3,45345,345,34,53,5,345,5};
        long startTime = System.currentTimeMillis(); // Start time
        System.out.println("at index "+(search(arr,5)));
        long endTime = System.currentTimeMillis(); // End time
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration +"ms");
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
