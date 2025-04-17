// // public class NewArray {
// //     public static void main(String[] args) {
// //         int[][] arr = new int[2][2]; // Declaring a 2D array
// //         arr[1][1] = 245; // Assigning a value

// //         //System.out.println(arr[1][1]); // Printing a single element

// //         // Corrected for-each loop to iterate over a 2D array
// //         for (int[] row : arr) {
// //             for (int value : row) {
// //                 System.out.println(value+ " ");
// //             }
// //         System.out.println();
            
// // }
// // }
// // }


// // public class NewArray {
// //     public static void main(String[] args) {
// //         int[][] arr = new int[2][2]; // Declaring a 2D array
// //         arr[1][1] = 245; // Assigning a value

// //         System.out.println("Matrix representation:");
// //         for (int[] row : arr) {
// //             for (int value : row) {
// //                 System.out.print(value +   " " ); // Print values in a row
// //             }
// //             System.out.println( " "); // Move to next line after printing a row
// // }
// // }
// // }
// import java.util.Scanner;
// class NewArray{
//     public static void main(String[] args) {
//         Scanner in =new Scanner(System.in);
//         int arr[][]=new int [3][3];
//         for(int row=0;row<arr.length;row++){
//             for(int col=0;col<arr[row].length;col++){
//                 arr[row][col]=in.nextInt();
//             }
//         }
//         for(int row=0;row<arr.length;row++){
//             for(int col=0;col<arr[row].length;col++){
//                 System.out.print(arr[row][col]+" ");
//             }
//             System.out.println();
//         } 
//     }
// }
class NewArray{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int target=7;
        int[] result=seena(arr, target);
        System.out.println(result[0]+""+result[1]);
    }
    static int[] seena(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i , j};
                }

            }
        }
        return null;
    }
}