// public class armstrong {
//     public static void main(String[] args) {
//         for(int i=100;i<1000;i++){
//             int temp=i;
//             int rem;
//             int ans=0;
//             while(temp>0){
//                 rem=temp%10;
//                 ans=ans+rem*rem*rem;
//                 i=i/10;
//             }
//             if(ans==i){
//                 System.out.println(i);
//             }
//         }
//     }
// }
public class armstrong{
    public static void main(String[] args) {
        System.out.println("Three-digit Armstrong numbers are:");

        for (int i = 100; i < 1000; i++) { // Loop through all three-digit numbers
            int temp = i; // Store the current number in a temporary variable
            int rem;
            int ans = 0;

            while (temp > 0) {
                rem = temp % 10; // Extract the last digit
                ans = ans + (rem * rem * rem); // Add the cube of the digit to ans
                temp = temp / 10; // Remove the last digit
            }

            if (ans == i) { // Check if the calculated value equals the original number
                System.out.println(i); // Print the Armstrong number
            }
        }
    }
}
