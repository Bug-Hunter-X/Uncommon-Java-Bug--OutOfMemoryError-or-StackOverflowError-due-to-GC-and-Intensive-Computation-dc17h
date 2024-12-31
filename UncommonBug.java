public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        try {
            while (true) {
                i++;
                if (i % 100000 == 0) {
                    System.gc(); // Request garbage collection
                }
                // Simulate some work 
                int j = 1;
                for (int k = 0; k < 1000000; k++) {
                    j += k;
                }
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Out of memory error: " + e.getMessage());
        } catch (StackOverflowError e) {
            System.err.println("Stack overflow error: " + e.getMessage());
        }
    }
}