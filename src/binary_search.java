public class binary_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,34,56};
        System.out.println(search(arr,56));
    }
    static int search(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid;
            mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
return -1;
    }
}
