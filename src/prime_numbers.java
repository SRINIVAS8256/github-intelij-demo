public class prime_numbers {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isprime(int num){
        int i=2;
        while(i*i<=num) {
            if(num%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
