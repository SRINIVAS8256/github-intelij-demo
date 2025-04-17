public class arr_max {
    public static void main(String[] args) {
        int[] arr={11,5,7,6,86,8,87,978,-100,-200};
        int max=arr[0];
        System.out.println(min(arr,max));
    }
    static int min(int[] arr,int max){
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) {
                max= arr[i];
            }
        }
        return max;
    }
}