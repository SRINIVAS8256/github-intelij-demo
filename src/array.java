import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // int [][] dd={
        //     {1,2,3},
        //     {4,5,},
        //     {7,8,9,234,234,24,2}
        // };
        // System.out.println(Arrays.toString(dd[2]));
        Scanner in=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[row].length;col++){
                arr2[row][col]=in.nextInt();
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[row].length;col++){
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }
        int arr3[][]=new int[3][3];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr3[row][col]=arr[row][col]+arr2[row][col];
            }
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr3[row][col]+" ");
            }
            System.out.println();
        }  
    
    }
}
