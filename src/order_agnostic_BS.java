public class order_agnostic_BS {
    public static void main(String[] args) {
        int[] arr={100,90,80,70,60,50,40,30,20,10};
        System.out.println(search(arr,80));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }else{
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
