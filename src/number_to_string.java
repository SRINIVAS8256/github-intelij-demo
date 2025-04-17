public class number_to_string   {
    public static void main(String[] args) {
        int x = 262;

        // Convert int to String
        String str = String.valueOf(x);

        // Convert String to char array
        char[] charArray = str.toCharArray();

        // Convert String to String array
        String[] stringArray = str.split("");

        // Convert String to int array
        int[] intArray = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            intArray[i] = Character.getNumericValue(str.charAt(i));
        }

        // Print results
        System.out.println("Original int: " + x);
        System.out.println("String: " + str);
        System.out.print("Char Array: ");
        for (char c : charArray) System.out.print(c + " ");
        System.out.print("\nString Array: ");
        for (String s : stringArray) System.out.print(s + " ");
        System.out.print("\nInt Array: ");
        for (int i : intArray) System.out.print(i+"");
        System.out.println("\n"+intArray.length);
    }
}

