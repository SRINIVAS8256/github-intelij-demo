//public class myStrngsearch {
//    public static void main(String[] args) {
//        char[] arr={'s','i','n','g','l','e','s','e','e','n','a'};
//        char[] target={'s','e','e','n','a'};
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target[0]){
//                for (int j = 0; j < target.length; j++) {
//                    if(arr[i+j] == target[j]){
//                        System.out.println("yes"+ " "+(i+j)+" "+arr[i+j]);
//                    }
//                }
//            }
//        }
//    }
//}



//public class myStrngsearch {
//    public static void main(String[] args) {
//        char[] arr = {'s','i','n','g','l','e','s','e','e','n','a'};
//        char[] target = {'s','e','e','n','a'};
//
//        for (int i = 0; i <= arr.length - target.length; i++) {
//            if (arr[i] == target[0]) {
//                boolean match = true;
//                // Check if the entire target matches
//                for (int j = 1; j < target.length; j++) {
//                    if (arr[i + j] != target[j]) {
//                        match = false;
//                        break;
//                    }
//                }
//                if (match) {
//                    // Only print if the full sequence matches
//                    for (int j = 0; j < target.length; j++) {
//                        System.out.println("yes" + " " + (i + j) + " " + arr[i + j]);
//                    }
//                    // Skip ahead since we found a match
//                    i += target.length - 1;
//                }
//            }
//        }
//    }
//}


public class myStrngsearch {
    public static void main(String[] args) {
        char[] arr = {'s','i','n','g','l','e','s','e','e','n','a'};
        char[] target = {'s','e','e','m','a'};
        boolean found = false;

        for (int i = 0; i <= arr.length - target.length; i++) {
            if (arr[i] == target[0]) {
                boolean match = true;
                for (int j = 1; j < target.length; j++) {
                    if (arr[i + j] != target[j]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    found = true;
                    break;  // Exit loop after first match
                }
            }
        }

        if (found) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}