public class time_complexity {
            public static void main(String[] args) {
                long startTime = System.currentTimeMillis(); // Start time

                // Your code here
                for (int i = 0; i < 1000000; i++) {
                    int x = i * i;
                }

                long endTime = System.currentTimeMillis(); // End time

                long duration = endTime - startTime;
                System.out.println("Execution time: " + duration +"ms");
}
        }
    