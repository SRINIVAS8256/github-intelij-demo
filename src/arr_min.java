public class arr_min {
    public static void main(String[] args) {
        int[] arr={11,5,7,6,86,8,87,978,-100,-200};
        int min=arr[0];
        System.out.println(min(arr,min));
    }
    static int min(int[] arr,int min){
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
