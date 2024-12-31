public class UncommonBugSolution {
    public static void main(String[] args) {
        // Improved solution: batch processing
        int batchSize = 10000; // Adjust batch size as needed
        for (int i = 0; i < Integer.MAX_VALUE; i += batchSize) {
            for (int j = i; j < i + batchSize; j++) {
                //Perform work efficiently
                int k = 1;
                for(int l=0; l < 10000; l++){
                    k += l;
                }
            }
            // Optional: Consider GC if large batches are used
            System.gc();
        }
    }
}