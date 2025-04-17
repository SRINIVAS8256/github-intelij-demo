// import java.util.Scanner;
// class s1{
//     public static void main(String[] args) {
//         Scanner in =new Scanner(System.in);
//         // System.out.println("enter an integer");
//         // int n= in.nextInt();
//         isprime();
    
            
//     }
//     static void isprime(){
//         for(int n=0;n<100;n++){
//         if(n<=1){
//             break;
//         }
//         int c=2;
//         while(c*c<=n){
//             if(n%c==0){
//                 continue;
//             }
//             if(c*c>n){
//                 continue;
//             }
//             System.out.println(n);
//             c++;
//         }
//         }}
        // static int ff(){
        //     int n;
        //     for(n=0;n<100;n++){
        //        int c=2;
        //        while(c*c<=n){
        //         if(n%c == 0){
        //             return 0;
        //         }
        //         if(c*c>n){
        //             return n;
        //         }
        //        }
        //     }
        // }
    //}
class s1{
    public static void main(String[] args) {
        for(int n=2;n<=100;n++){
            int c=2;
            while(c*c <= n){
                if(n%c == 0){
                    break;
                }
                if(c*c>n){
                    break;
                }
                 System.out.println(n);
                c++;
                
            }             
        }
    }
}