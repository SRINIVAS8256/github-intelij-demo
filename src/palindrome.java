// public class palindrome {
//     public static void main(String[] args) {
//         int n=124;
//         int temp=n;
//         int rem;
//         int ans=0;
//         while(n>0){
//             rem=n%10;
//             ans=ans*10+rem;
//             n=n/10;
//         }
//         if(temp == ans){
//             System.out.println("yes");
//         }else{
//             System.out.println("no");
//         }
//     }
// }
// public class palindrome{
//     public static void main(String[] args) {
//         int ans=0;
//         int rem;
//         int temp;
//         for(int i=11;i<100;i++){
//             temp=i;
//             while(i>0){
//                 rem=i%10;
//                 ans=ans*10+rem;
//                 i=i/10;
//             }
//             if(ans == i){
//                 System.out.println(i);
//             }
//         }
//     }
//}
public class palindrome{
    public static void main(String[] args) {
        for (int i = 11; i < 1000; i++) {
            int temp = i;
            int ans = 0;
            while (temp > 0) {
                int rem = temp % 10;
                ans = ans * 10 + rem;
                temp = temp / 10;
            }
            if (ans == i) {
                System.out.println(i);
            }
        }
    }
}

 