import java.util.Arrays;

public class string_search {
    public static void main(String[] args) {
        String name="seena";
        char target='o';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target){
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
