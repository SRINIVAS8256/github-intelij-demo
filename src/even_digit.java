public class even_digit {
    public static void main(String[] args) {
        int[] nums={1,22,12,12,3435,66,923844,0,11,11,11,8123,00};
//        System.out.println(find(nums));
        System.out.println(digits2(-567));
    }
    static int find(int[] nums){
        int count=0;
        for (int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int dd=digits2(num);
        return dd%2 == 0;
    }
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
    static int digits(int num){

        if(num == 0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}