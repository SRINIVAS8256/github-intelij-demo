public class richest_customer_problem {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(wealth(arr));
    }
    static int wealth(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int rowsum=0;
            for(int j=0;j<arr[i].length;j++){
                rowsum=rowsum+arr[i][j];
            }
            if(rowsum>ans){
                ans=rowsum;
            }
        }
        return ans;
    }
}
