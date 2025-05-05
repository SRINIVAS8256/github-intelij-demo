public class binary_search_me{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9};
        long startTime = System.currentTimeMillis(); // Start time
        System.out.println("at index of "+search(arr,9)+" = "+arr[search(arr,4)]);
        long endTime = System.currentTimeMillis(); // End time
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration +"ms");
    }
    static int search(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        int start=arr[i];
        int end=arr[j];
        while(start <end){
            start=arr[i];
            end=arr[j];
            if(arr[i]==target){
                return i;
            }
            if(arr[j]==target){
                return j;
            }
            i++;
            j--;
        }
        return -1;
    }
}
