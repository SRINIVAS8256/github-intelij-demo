import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        boolean swapped;
        swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                }

                swapped=true;
            }
            if(!swapped){
                break;
            }
        }

    }
}
